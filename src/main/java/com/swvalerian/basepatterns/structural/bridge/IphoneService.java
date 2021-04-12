package main.java.com.swvalerian.basepatterns.structural.bridge;

public class IphoneService extends Service {
    protected IphoneService(ServiceMan serviceMan) {
        super(serviceMan);
    }

    @Override
    void repairPhone() {
        System.out.println("Iphone service repairing!");
        serviceMan.repairPhone();
    }
}
