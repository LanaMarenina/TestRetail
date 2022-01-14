package ru.my.shop.store.Products.Drink;

public class NonAlcohol extends Drink {

    private String type; //газир или негазир

    public NonAlcohol(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.type = type;
    }

    public NonAlcohol(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public NonAlcohol() {

    }
}
