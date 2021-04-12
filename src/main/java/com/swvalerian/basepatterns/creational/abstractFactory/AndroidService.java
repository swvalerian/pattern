package main.java.com.swvalerian.basepatterns.creational.abstractFactory;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop.AndroidTeamFactory;

public class AndroidService {
    public static void main(String[] args) {
        RepairTeamFactory repairTeamFactory = new AndroidTeamFactory();
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
