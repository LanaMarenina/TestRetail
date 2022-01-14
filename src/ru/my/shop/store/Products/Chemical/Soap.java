package ru.my.shop.store.Products.Chemical;

public class Soap extends Chemicals {

    private String smell;

    public Soap(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, String purposeOfUse, String smell) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, purposeOfUse);
        this.smell = smell;
    }

    public Soap(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Soap() {

    }
}
