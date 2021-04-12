package main.java.com.swvalerian.basepatterns.structural.adapter;

public class DatabaseFileAdapter extends JavaApp implements DataBase {
    @Override
    public void create() {
        saveFile();
    }

    @Override
    public void read() {
        selectFile();
    }

    @Override
    public void update() {
        updateFile();
    }

    @Override
    public void delete() {
        deleteFile();
    }
}
