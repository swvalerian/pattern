package main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.*;

public class AndroidTeamFactory implements RepairTeamFactory {
    @Override
    public Receptionist getReceptionist() {
        return new AndroidReception();
    }

    @Override
    public RepairMan getRepairMan() {
        return new AndroidRepairMan();
    }

    @Override
    public SupplierPhoneParts getSupplier() {
        return new SupplierAndroidParts();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new PMAndroidShop();
    }
}
