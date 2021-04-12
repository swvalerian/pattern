package main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.RepairMan;

public class AndroidRepairMan implements RepairMan {
    @Override
    public void repairPhone() {
        System.out.println("Andorid repairman repairing android phone");
    }
}
