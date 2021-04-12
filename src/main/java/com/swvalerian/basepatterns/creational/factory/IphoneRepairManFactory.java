package main.java.com.swvalerian.basepatterns.creational.factory;

public class IphoneRepairManFactory implements RepairManFactory {
    @Override
    public RepairMan createRepairMan() {
        return new IphoneRepairMan();
    }
}
