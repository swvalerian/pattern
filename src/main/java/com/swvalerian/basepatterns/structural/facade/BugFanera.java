package main.java.com.swvalerian.basepatterns.structural.facade;

public class BugFanera {
    private boolean activeMicrofone;

    public boolean isActiveMicrofone() {
        return activeMicrofone;
    }

    public void singSong() {
        System.out.println("Sing a song");
        activeMicrofone = true;
    }

    public void stopSing() {
        System.out.println("Stop sing a song");
        activeMicrofone = false;
    }
}
