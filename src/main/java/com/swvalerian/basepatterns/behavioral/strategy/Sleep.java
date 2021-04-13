package main.java.com.swvalerian.basepatterns.behavioral.strategy;

public class Sleep implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
