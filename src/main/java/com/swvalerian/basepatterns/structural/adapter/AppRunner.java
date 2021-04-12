package main.java.com.swvalerian.basepatterns.structural.adapter;

public class AppRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DatabaseFileAdapter();
        dataBase.create();
        dataBase.read();
        dataBase.delete();
        dataBase.update();
    }
}
