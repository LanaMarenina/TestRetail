package ru.my.shop.store.Products.Chemical;

import ru.my.shop.store.Products.Product;

public class Chemicals extends Product {

    private String composition;
    private float volume;
    private String purposeOfUse;

    public Chemicals(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, String purposeOfUse) {
        super(nameOfProduct, amountOfProduct, priceOfProduct);
        this.composition = composition;
        this.volume = volume;
        this.purposeOfUse = purposeOfUse;
    }

    public Chemicals(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Chemicals() {

    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public String getPurposeOfUse() {
        return purposeOfUse;
    }

    public void setPurposeOfUse(String purposeOfUse) {
        this.purposeOfUse = purposeOfUse;
    }
}
