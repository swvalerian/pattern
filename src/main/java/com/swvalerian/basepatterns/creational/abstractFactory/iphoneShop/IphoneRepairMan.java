package main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.RepairMan;

public class IphoneRepairMan implements RepairMan {
    @Override
    public void repairPhone() {
        System.out.println("Iphone master repairing iphone...");
    }
}
