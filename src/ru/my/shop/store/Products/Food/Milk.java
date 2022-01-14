package ru.my.shop.store.Products.Food;

public class Milk extends DairyProducts {

    private double percentOfFat;

    public Milk(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, double percentOfFat) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.percentOfFat = percentOfFat;
    }

    public Milk(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Milk() {
    }
}
