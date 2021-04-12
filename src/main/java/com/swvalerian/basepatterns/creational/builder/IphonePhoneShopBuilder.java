package main.java.com.swvalerian.basepatterns.creational.builder;

public class IphonePhoneShopBuilder extends PhoneShopBuilder {
    @Override
    void buildModel() {
        phoneShop.setModel("Iphone 13");
    }

    @Override
    void buildOS() {
        phoneShop.setOs(Os.IOs);
    }

    @Override
    void buildPrice() {
        phoneShop.setPrice(2000);
    }
}
