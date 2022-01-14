package ru.my.shop.store.Products.Drink;

public class Beer extends Alcohol{

    private String taste;

    public Beer(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, double percentOfAlcohol, String taste) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, percentOfAlcohol);
        this.taste = taste;
    }

    public Beer(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Beer() {

    }
}
