package ru.my.shop.store.Products.Food;

public class DairyProducts extends Food {

    private double volume;

    public DairyProducts(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition);
        this.volume = volume;
    }

    public DairyProducts(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public DairyProducts() {

    }
}
