package main.java.com.swvalerian.basepatterns.structural.decorator;

public class SuperServiceMan extends RepairServiceManDecorator {
    public SuperServiceMan(RepairServiceMan repairServiceMan) {
        super(repairServiceMan);
    }

    public String repairHardTrablPhone() {
        return "repairing hard trable phone.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + repairHardTrablPhone();
    }
}
