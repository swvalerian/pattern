package main.java.com.swvalerian.basepatterns.structural.decorator;

public class AndroidServiceMan implements RepairServiceMan{
    @Override
    public String makeJob() {
        return "Repairing android phone.";
    }
}
