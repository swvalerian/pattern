package main.java.com.swvalerian.basepatterns.behavioral.state;

public class SingerDay {
    public static void main(String[] args) {
        Activity activity = new Eating();
        Singer singer = new Singer();

        singer.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            singer.justSingIt();
            singer.changeActivity();
        }
    }
}
