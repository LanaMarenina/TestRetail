package ru.my.shop;

public class Shop {

    private String nameOfShop = "Big C";
    private String addressOfShop = "Moscow, Lenina, 12";

    public Shop(String nameOfShop, String addressOfShop) {
        this.nameOfShop = nameOfShop;
        this.addressOfShop = addressOfShop;
    }

    public Shop() {

    }

    public String getNameOfShop() {
        return nameOfShop;
    }

    public String getAddressOfShop() {
        return addressOfShop;
    }

}
