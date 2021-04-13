package main.java.com.swvalerian.basepatterns.behavioral.state;

public class Singer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sing) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Sleeping());
        } else if (activity instanceof Sleeping) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sing());
        }
    }

    public void justSingIt() {
        activity.justSingIt();
    }
}
