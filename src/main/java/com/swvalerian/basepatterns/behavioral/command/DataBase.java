package main.java.com.swvalerian.basepatterns.behavioral.command;

public class DataBase {
    public void insert() { System.out.println("Inserting record"); }
    public void select() { System.out.println("Selecting record"); }
    public void delete() {
        System.out.println("Deleting record");
    }
    public void update() {
        System.out.println("Updating record");
    }
}
