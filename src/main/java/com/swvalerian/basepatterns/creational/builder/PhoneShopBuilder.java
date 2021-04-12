package main.java.com.swvalerian.basepatterns.creational.builder;

public abstract class PhoneShopBuilder {
    PhoneShop phoneShop;

    void createPhoneShop() {
        phoneShop = new PhoneShop();
    }

    PhoneShop getPhoneShop() {
        return phoneShop;
    }

    abstract void buildModel();
    abstract void buildOS();
    abstract void buildPrice();

}
