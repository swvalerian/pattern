package main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.ProjectManager;

public class PMIphoneShop implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages iphone service shop");
    }
}
