package main.java.com.swvalerian.basepatterns.creational.abstractFactory;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop.IphoneTeamFactory;

public class IphoneService {
    public static void main(String[] args) {
        RepairTeamFactory repairTeamFactory = new IphoneTeamFactory();
        Receptionist receptionist = repairTeamFactory.getReceptionist();
        RepairMan repairMan = repairTeamFactory.getRepairMan();
        SupplierPhoneParts supplierPhoneParts = repairTeamFactory.getSupplier();
        ProjectManager projectManager = repairTeamFactory.getProjectManager();

        System.out.println("Project creating...");
        receptionist.takePhone();
        supplierPhoneParts.suppliesSpareParts();
        repairMan.repairPhone();
        projectManager.manageProject();

    }
}
