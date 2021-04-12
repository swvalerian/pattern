package main.java.com.swvalerian.basepatterns.creational.builder;

public class PhoneShop {
    private String model;
    private Os os;
    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PhoneShop{" +
                "model='" + model + '\'' +
                ", os=" + os +
                ", price=" + price +
                '}';
    }

}
