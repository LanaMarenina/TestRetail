package ru.my.shop.store.Products.Drink;

public class NonAlcohol extends Drink {

    private String type; //газир или негазир

    public NonAlcohol(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.type = type;
    }

    public NonAlcohol(float priceOfProduct) {
        super(priceOfProduct);
    }

    public NonAlcohol() {

    }
}
