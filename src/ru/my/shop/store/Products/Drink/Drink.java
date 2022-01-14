package ru.my.shop.store.Products.Drink;

import ru.my.shop.store.Products.Product;

public class Drink extends Product {

    private String composition;
    private double volume;

    public Drink(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume) {
        super(nameOfProduct, amountOfProduct, priceOfProduct);
        this.composition = composition;
        this.volume = volume;
    }

    public Drink(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Drink() {
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
