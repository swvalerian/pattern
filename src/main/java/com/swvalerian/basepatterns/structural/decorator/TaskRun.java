package main.java.com.swvalerian.basepatterns.structural.decorator;

public class TaskRun {
    public static void main(String[] args) {
        RepairServiceMan repairServiceMan = new OldMasterServiceMan(new SuperServiceMan(new AndroidServiceMan()));

        System.out.println(repairServiceMan.makeJob());
    }
}
