package main.java.com.swvalerian.basepatterns.factory;

public class ChinaRepairManFactory implements RepairManFactory {
    @Override
    public RepairMan createRepairMan() {
        return new ChinaRepairMan();
    }
}
