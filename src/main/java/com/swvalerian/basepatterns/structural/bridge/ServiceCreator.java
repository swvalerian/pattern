package main.java.com.swvalerian.basepatterns.structural.bridge;

public class ServiceCreator {
    public static void main(String[] args) {
        Service [] services = {
                new AndroidService(new IphoneRepairMan()),
                new IphoneService(new IphoneRepairMan())
        };

        for (Service service : services) {
            service.repairPhone();
        }

    }
}
