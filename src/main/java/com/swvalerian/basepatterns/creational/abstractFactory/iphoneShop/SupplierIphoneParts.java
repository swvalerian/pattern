package main.java.com.swvalerian.basepatterns.creational.abstractFactory.iphoneShop;

import main.java.com.swvalerian.basepatterns.creational.abstractFactory.SupplierPhoneParts;

public class SupplierIphoneParts implements SupplierPhoneParts {
    @Override
    public void suppliesSpareParts() {
        System.out.println("I supplies iphone parts");
    }
}
