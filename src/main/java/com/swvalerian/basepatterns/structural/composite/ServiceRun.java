package main.java.com.swvalerian.basepatterns.structural.composite;


public class ServiceRun {
    public static void main(String[] args) {
        Team team = new Team();

        ServiceMans firstAndroidServiceMan = new AndroidServiceMan();
        ServiceMans secondAndroidServiceMan = new AndroidServiceMan();
        ServiceMans firstIphoneServiceMan = new IphoneServiceMan();

        team.addServiceMan(firstAndroidServiceMan);
        team.addServiceMan(secondAndroidServiceMan);
        team.addServiceMan(firstIphoneServiceMan);

        team.repairPhone();
    }
}
