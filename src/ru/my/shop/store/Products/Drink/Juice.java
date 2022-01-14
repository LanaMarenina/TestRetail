package ru.my.shop.store.Products.Drink;

public class Juice extends NonAlcohol {

    private String taste;

    public Juice(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, String type, String taste) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, type);
        this.taste = taste;
    }

    public Juice(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Juice() {

    }
}
