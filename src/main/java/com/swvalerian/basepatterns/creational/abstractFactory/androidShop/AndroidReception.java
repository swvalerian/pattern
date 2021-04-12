package main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.Receptionist;

public class AndroidReception implements Receptionist {
    @Override
    public void takePhone() {
        System.out.println("Give me you break dead android phone!");
    }
}
