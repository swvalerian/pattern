package main.java.com.swvalerian.basepatterns.behavioral.command;

public class UpdateCommand implements Command{
    DataBase dataBase;

    public UpdateCommand(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.update();
    }
}
