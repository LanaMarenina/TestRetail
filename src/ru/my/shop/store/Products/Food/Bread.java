package ru.my.shop.store.Products.Food;

public class Bread extends Bakery{

    private String type; //ржаной, пшеничный...

    public Bread(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double weight, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, weight);
        this.type = type;
    }

    public Bread(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Bread() {
    }

}
