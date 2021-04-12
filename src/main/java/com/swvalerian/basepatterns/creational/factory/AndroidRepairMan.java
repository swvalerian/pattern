package main.java.com.swvalerian.basepatterns.creational.factory;

public class AndroidRepairMan implements RepairMan {
    @Override
    public void phoneRepair() {
        System.out.println("AndroidRepairMan: the Android phone is being repaired");
    }
}
