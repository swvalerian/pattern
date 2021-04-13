package main.java.com.swvalerian.basepatterns.behavioral.state;

public class Sleeping implements Activity {
    @Override
    public void justSingIt() {
        System.out.println("Sleeping...");
    }
}
