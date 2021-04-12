package main.java.com.swvalerian.basepatterns.creational.builder;

public class BuildPhoneShopRunner {
    public static void main(String[] args) {
        Kurator kurator = new Kurator();
        kurator.setBuilder(new ChinaPhoneShopBuilder());

        PhoneShop phoneShop = kurator.buildShop();

        System.out.println(phoneShop.toString());

    }
}
