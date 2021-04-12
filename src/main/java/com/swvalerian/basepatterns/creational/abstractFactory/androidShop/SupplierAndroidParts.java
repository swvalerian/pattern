package main.java.com.swvalerian.basepatterns.creational.abstractFactory.androidShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.SupplierPhoneParts;

public class SupplierAndroidParts implements SupplierPhoneParts {
    @Override
    public void suppliesSpareParts() {
        System.out.println("Suplling android phone parts...");
    }
}
