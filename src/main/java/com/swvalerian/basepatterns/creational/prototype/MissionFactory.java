package main.java.com.swvalerian.basepatterns.creational.prototype;

public class MissionFactory {
    Mission mission;

    Mission cloneMission() {
        return (Mission) mission.copy();
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public MissionFactory(Mission mission) {
        this.mission = mission;
    }
}
