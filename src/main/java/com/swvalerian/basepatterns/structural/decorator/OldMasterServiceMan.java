package main.java.com.swvalerian.basepatterns.structural.decorator;

public class OldMasterServiceMan extends RepairServiceManDecorator {
    public OldMasterServiceMan(RepairServiceMan repairServiceMan) {
        super(repairServiceMan);
    }

    public String makeChungaChanga() {
        return "I am nothing to do. I am seen to you!";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeChungaChanga();
    }
}
