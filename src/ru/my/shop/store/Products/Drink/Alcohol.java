package ru.my.shop.store.Products.Drink;

public class Alcohol extends Drink {

    private double percentOfAlcohol;

    public Alcohol(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, double percentOfAlcohol) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.percentOfAlcohol = percentOfAlcohol;
    }

    public Alcohol(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Alcohol() {

    }
}
