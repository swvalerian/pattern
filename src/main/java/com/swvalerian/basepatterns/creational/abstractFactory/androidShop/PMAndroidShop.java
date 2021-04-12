package main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.ProjectManager;

public class PMAndroidShop implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM android shop managin android service");
    }
}
