package main.java.com.swvalerian.basepatterns.creational.factory;

public class IphoneRepairMan implements RepairMan {
    @Override
    public void phoneRepair() {
        System.out.println("IphoneRepairMan: the Iphone is being repaired");
    }
}
