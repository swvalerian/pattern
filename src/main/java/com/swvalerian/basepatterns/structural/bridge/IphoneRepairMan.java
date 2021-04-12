package main.java.com.swvalerian.basepatterns.structural.bridge;

public class IphoneRepairMan implements ServiceMan {
    @Override
    public void repairPhone() {
        System.out.println("Iphone repair man repairing Iphone phone...");
    }
}
