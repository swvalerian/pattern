package main.java.com.swvalerian.basepatterns.creational.prototype;

public class MissionControllRunner {
    public static void main(String[] args) {
        Mission mission = new Mission(44, "Амур","Смена места жительства");

        // хешкоды обьектов разные - а значит и ссылки на обьекты - разные, хотя обьекты по содержимому полей и методов одинаковые!
        System.out.println(mission + " = hashcode: " + mission.hashCode());
        System.out.println("\n ======================= \n");
        System.out.println(mission.copy() + " = hashcode: " + mission.copy().hashCode());
        System.out.println("\n ======================= \n");

        Mission copyMission = (Mission) mission.copy();

        System.out.println(copyMission + " = hashcode: " + copyMission.hashCode());

        // создадим фабрику наших методов. Будем делать прототипы
        MissionFactory factory = new MissionFactory(mission);

        System.out.println("\n ======================= \n");
        // Приводить тип ненадо, сразу получаем копию обьекта!
        System.out.println(factory.cloneMission() + " = hashcode: " + factory.cloneMission().hashCode());

        System.out.println("\n ======================= \n");
        // или так

        Mission missionCopyFromFactory = factory.cloneMission();
        System.out.println(missionCopyFromFactory + " = hashcode: " + missionCopyFromFactory.hashCode());

    }
}
