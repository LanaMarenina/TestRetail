package ru.my.shop.store.Products.Drink;

public class Alcohol extends Drink {

    private float percentOfAlcohol;

    public Alcohol(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, float percentOfAlcohol) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.percentOfAlcohol = percentOfAlcohol;
    }

    public Alcohol(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Alcohol() {

    }
}
