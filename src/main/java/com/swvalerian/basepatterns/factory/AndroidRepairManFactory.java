package main.java.com.swvalerian.basepatterns.factory;

public class AndroidRepairManFactory implements RepairManFactory {
    @Override
    public RepairMan createRepairMan() {
        return new AndroidRepairMan();
    }
}
