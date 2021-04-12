package main.java.com.swvalerian.basepatterns.structural.decorator;

public class RepairServiceManDecorator implements RepairServiceMan {
    RepairServiceMan repairServiceMan;

    public RepairServiceManDecorator(RepairServiceMan repairServiceMan) {
        this.repairServiceMan = repairServiceMan;
    }

    @Override
    public String makeJob() {
        return repairServiceMan.makeJob();
    }
}
