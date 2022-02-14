package ru.my.shop.store.Products.Food;

public class Bakery extends Food {

    private float weight;

    public Bakery(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float weight) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition);
        this.weight = (float) weight;
    }

    public Bakery(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Bakery() {
    }


}
