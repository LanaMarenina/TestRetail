package ru.my.shop.store.Products.Drink;

import ru.my.shop.store.Products.Product;

public class Drink extends Product {

    private String composition;
    private float volume;

    public Drink(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume) {
        super(nameOfProduct, amountOfProduct, priceOfProduct);
        this.composition = composition;
        this.volume = volume;
    }

    public Drink(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Drink() {
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
