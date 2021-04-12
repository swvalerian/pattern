package main.java.com.swvalerian.basepatterns.structural.bridge;

public abstract class Service {
    protected ServiceMan serviceMan;

    protected Service(ServiceMan serviceMan) {
        this.serviceMan = serviceMan;
    }

    abstract void repairPhone();
}
