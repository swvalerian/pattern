package main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.Receptionist;

public class IphoneReception implements Receptionist {
    @Override
    public void takePhone() {
        System.out.println("Give me you break iphone!");
    }
}
