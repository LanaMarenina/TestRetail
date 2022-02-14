package ru.my.shop.store.Products.Food;

public class DairyProducts extends Food {

    private float volume;

    public DairyProducts(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition);
        this.volume = volume;
    }

    public DairyProducts(float priceOfProduct) {
        super(priceOfProduct);
    }

    public DairyProducts() {

    }
}
