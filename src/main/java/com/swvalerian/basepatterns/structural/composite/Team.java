package main.java.com.swvalerian.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements ServiceMans {
    private List<ServiceMans> serviceMans = new ArrayList<>();

    public void addServiceMan(ServiceMans serviceMans) {
        this.serviceMans.add(serviceMans);
    }

    public void removeServiceMans(ServiceMans serviceMans) {
        this.serviceMans.remove(serviceMans);
    }

    @Override
    public void repairPhone() {
        System.out.println("\nTeam repairing phones:\n");
        for (ServiceMans serviceMan : serviceMans) {
            serviceMan.repairPhone();
        }
    }
}
