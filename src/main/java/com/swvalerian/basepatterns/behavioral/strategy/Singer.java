package main.java.com.swvalerian.basepatterns.behavioral.strategy;

public class Singer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity(){
        activity.justDoIt();
    }
}
