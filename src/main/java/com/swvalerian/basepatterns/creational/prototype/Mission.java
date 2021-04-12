package main.java.com.swvalerian.basepatterns.creational.prototype;

public class Mission implements CopyAble {
    int id;
    String name;
    String intention;

    @Override
    public String toString() {
        return "Mission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", intention='" + intention + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public Mission(int id, String name, String intention) {
        this.id = id;
        this.name = name;
        this.intention = intention;
    }

    @Override
    public Object copy() {
        Mission mission = new Mission(id, name, intention);
        return mission;
    }
}
