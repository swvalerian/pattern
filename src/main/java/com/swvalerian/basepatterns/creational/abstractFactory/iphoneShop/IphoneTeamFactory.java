package main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.*;

public class IphoneTeamFactory implements RepairTeamFactory {
    @Override
    public Receptionist getReceptionist() {
        return new IphoneReception();
    }

    @Override
    public RepairMan getRepairMan() {
        return new IphoneRepairMan();
    }

    @Override
    public SupplierPhoneParts getSupplier() {
        return new SupplierIphoneParts();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMIphoneShop();
    }
}
