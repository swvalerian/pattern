package main.java.com.swvalerian.basepatterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void Load(Save save) {
        date = save.getDate();
        version = save.getVersion();
    }

    @Override
    public String toString() {
        return "\nProject: " +
                "\nVersion:'" + version +
                "\nDate:" + date + "\n";
    }
}
