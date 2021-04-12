package main.java.com.swvalerian.basepatterns.creational.factory;

public class AndroidRepairManFactory implements RepairManFactory {
    @Override
    public RepairMan createRepairMan() {
        return new AndroidRepairMan();
    }
}
