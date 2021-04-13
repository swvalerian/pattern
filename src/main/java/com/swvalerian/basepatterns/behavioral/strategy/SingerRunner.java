package main.java.com.swvalerian.basepatterns.behavioral.strategy;

import main.java.com.swvalerian.basepatterns.behavioral.state.Sleeping;

public class SingerRunner {
    public static void main(String[] args) {
        Singer singer = new Singer();

        singer.setActivity(new Sleep());
        singer.executeActivity();

        singer.setActivity(new Training());
        singer.executeActivity();

        singer.setActivity(new Eating());
        singer.executeActivity();

        singer.setActivity(new Sing());
        singer.executeActivity();
    }
}
