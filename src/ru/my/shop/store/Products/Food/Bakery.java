package ru.my.shop.store.Products.Food;

public class Bakery extends Food {

    private double weight;

    public Bakery(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double weight) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition);
        this.weight = weight;
    }

    public Bakery(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Bakery() {
    }

}
