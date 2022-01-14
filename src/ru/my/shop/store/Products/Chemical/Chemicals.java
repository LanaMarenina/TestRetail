package ru.my.shop.store.Products.Chemical;

import ru.my.shop.store.Products.Product;

public class Chemicals extends Product {

    private String composition;
    private double volume;
    private String purposeOfUse;

    public Chemicals(String nameOfProduct, double amountOfProduct, double priceOfProduct, String composition, double volume, String purposeOfUse) {
        super(nameOfProduct, amountOfProduct, priceOfProduct);
        this.composition = composition;
        this.volume = volume;
        this.purposeOfUse = purposeOfUse;
    }

    public Chemicals(String nameOfProduct, double priceOfProduct) {
        super(nameOfProduct, priceOfProduct);
    }

    public Chemicals() {

    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(String purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }
}
