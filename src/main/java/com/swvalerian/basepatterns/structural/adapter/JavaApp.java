package main.java.com.swvalerian.basepatterns.structural.adapter;

// этот класс нужно подружить с интерфейсом DataBase - который служит для рабты с базой данных
public class JavaApp {
    public void saveFile() {
        System.out.println("Saving file...");
    }
    public void selectFile() {
        System.out.println("Selecting file...");
    }
    public void updateFile() {
        System.out.println("Updating file...");
    }
    public void deleteFile() {
        System.out.println("Deleting file...");
    }
}
