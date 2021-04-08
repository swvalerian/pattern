package main.java.com.swvalerian.basepatterns.factory;

public class ChinaRepairMan implements RepairMan {
    @Override
    public void phoneRepair() {
        System.out.println("ChinaRepairMan: the china phones is being repaired");
    }
}
