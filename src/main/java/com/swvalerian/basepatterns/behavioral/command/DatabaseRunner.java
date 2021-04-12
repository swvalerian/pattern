package main.java.com.swvalerian.basepatterns.behavioral.command;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        Developer developer = new Developer(
                new InsertCommand(dataBase),
                new SelectCommand(dataBase),
                new UpdateCommand(dataBase),
                new DeleteCommand(dataBase)
        );

        developer.insertRecord();
        developer.selectRecord();
        developer.updateRecord();
        developer.deleteRecord();
    }
}
