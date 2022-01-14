package ru.my.shop.store.Products.Chemical;

public class Powder extends Chemicals {

    private String type; //для цветного или белого

    public Powder(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, String purposeOfUse, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, purposeOfUse);
        this.type = type;
    }

    public Powder(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Powder() {

    }
}
