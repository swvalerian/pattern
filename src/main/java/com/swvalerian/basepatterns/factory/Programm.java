package main.java.com.swvalerian.basepatterns.factory;

public class Programm {
    public static void main(String[] args) {
        RepairManFactory repairManFactory = createRepairManBySpecialty("china");
        RepairMan repairMan = repairManFactory.createRepairMan();
        repairMan.phoneRepair();
    }

    static RepairManFactory createRepairManBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("android")) {
            return new AndroidRepairManFactory();
        } else if (specialty.equalsIgnoreCase("iphone")) {
            return new IphoneRepairManFactory();
        } else if (specialty.equalsIgnoreCase("china")) {
            return new ChinaRepairManFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
