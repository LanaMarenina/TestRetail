package ru.my.shop.store.Products;

import java.time.LocalDateTime;

public abstract class Product {

    private String nameOfProduct;
    private float amountOfProduct;
    private float priceOfProduct;
    private LocalDateTime dateOfUse;

    public Product(String nameOfProduct, float amountOfProduct, float priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.amountOfProduct = amountOfProduct;
        this.priceOfProduct = priceOfProduct;
    }


    public Product(float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public Product() {
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public float getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(float amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public float getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
}
