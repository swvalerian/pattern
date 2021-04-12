package main.java.com.swvalerian.basepatterns.structural.bridge;

public class AndroidService extends Service {
    protected AndroidService(ServiceMan serviceMan) {
        super(serviceMan);
    }

    @Override
    void repairPhone() {
        System.out.println("Android service repairing phones!");
        serviceMan.repairPhone();
    }
}
