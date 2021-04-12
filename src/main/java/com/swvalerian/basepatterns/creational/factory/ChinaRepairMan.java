package main.java.com.swvalerian.basepatterns.creational.factory;

public class ChinaRepairMan implements RepairMan {
    @Override
    public void phoneRepair() {
        System.out.println("ChinaRepairMan: the china phones is being repaired");
    }
}
