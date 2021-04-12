package main.java.com.swvalerian.basepatterns.creational.builder;

public class Kurator {
    PhoneShopBuilder builder;

    public void setBuilder(PhoneShopBuilder builder) {
        this.builder = builder;
    }

    PhoneShop buildShop() {
//        return builder.getPhoneShop();

        builder.createPhoneShop();
        builder.buildModel();
        builder.buildOS();
        builder.buildPrice();

        return builder.getPhoneShop();
    }
}
