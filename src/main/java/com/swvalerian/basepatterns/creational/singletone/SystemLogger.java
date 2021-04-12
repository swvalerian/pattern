package main.java.com.swvalerian.basepatterns.creational.singletone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemLogger {
    private static SystemLogger systemLogger; // создали экземпляр класса
    private static String strLog = "ABC ... \n\n";

    public static synchronized SystemLogger getSystemLogger() {
        if (systemLogger == null) {
            systemLogger = new SystemLogger();
        }

        return systemLogger;
    }

    private SystemLogger() {

    }

    public void addSystemInfo() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z");
        String getTime = df.format(new Date());
        strLog += getTime + "\n";
    }

    public void showSystemLog() {
        System.out.println(strLog);
    }
}
