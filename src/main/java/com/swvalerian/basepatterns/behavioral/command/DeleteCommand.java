package main.java.com.swvalerian.basepatterns.behavioral.command;

public class DeleteCommand implements Command {
    public DeleteCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    DataBase dataBase;

    @Override
    public void execute() {
        dataBase.delete();
    }
}
