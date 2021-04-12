package main.java.com.swvalerian.basepatterns.creational.factory;

public class ChinaRepairManFactory implements RepairManFactory {
    @Override
    public RepairMan createRepairMan() {
        return new ChinaRepairMan();
    }
}
