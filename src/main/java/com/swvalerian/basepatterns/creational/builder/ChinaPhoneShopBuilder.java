package main.java.com.swvalerian.basepatterns.creational.builder;

public class ChinaPhoneShopBuilder extends PhoneShopBuilder {
    @Override
    void buildModel() {
        phoneShop.setModel("Siemens c55");
    }

    @Override
    void buildOS() {
        phoneShop.setOs(Os.ANDROID);
    }

    @Override
    void buildPrice() {
        phoneShop.setPrice(100);
    }
}
