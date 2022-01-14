package ru.my.shop.store.Products.Food;

import ru.my.shop.store.Products.Product;

public class Food extends Product {

    private String composition;

    public Food(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition) {
        super(nameOfProduct, amountOfProduct, priceOfProduct);
        this.composition = composition;
    }

    public Food(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Food() {

    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
