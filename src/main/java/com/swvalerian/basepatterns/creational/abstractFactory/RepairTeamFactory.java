package main.java.com.swvalerian.basepatterns.creational.abstractFactory;

public interface RepairTeamFactory {
    Receptionist getReceptionist();
    RepairMan getRepairMan();
    SupplierPhoneParts getSupplier();
    ProjectManager getProjectManager();
}
