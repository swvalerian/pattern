package main.java.com.swvalerian.basepatterns.behavioral.command;

public class InsertCommand implements Command{
    public InsertCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    DataBase dataBase;

    @Override
    public void execute() {
        dataBase.insert();
    }
}
