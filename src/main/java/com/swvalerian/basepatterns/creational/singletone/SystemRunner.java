package main.java.com.swvalerian.basepatterns.creational.singletone;

import java.util.concurrent.TimeUnit;

public class SystemRunner {
    public static void main(String[] args) {
        SystemLogger.getSystemLogger().addSystemInfo();
        SystemLogger.getSystemLogger().addSystemInfo();
        SystemLogger.getSystemLogger().addSystemInfo();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SystemLogger.getSystemLogger().addSystemInfo();
        SystemLogger.getSystemLogger().addSystemInfo();
        SystemLogger.getSystemLogger().addSystemInfo();

        SystemLogger.getSystemLogger().showSystemLog();

    }
}
