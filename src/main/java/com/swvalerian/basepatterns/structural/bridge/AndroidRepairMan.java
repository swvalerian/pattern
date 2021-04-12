package main.java.com.swvalerian.basepatterns.structural.bridge;

public class AndroidRepairMan implements ServiceMan {
    @Override
    public void repairPhone() {
        System.out.println("Android repair man repairing android phone...");
    }
}
