package ru.my.shop.store.Products;

import java.time.LocalDateTime;

public class Product {

    private String nameOfProduct;
    private double amountOfProduct;
    private double priceOfProduct;
    private LocalDateTime dateOfUse;

    public Product(String nameOfProduct, double amountOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.amountOfProduct = amountOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    public Product(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
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

    public double getAmountOfProduct() {
        return amountOfProduct;
    }

    public void setAmountOfProduct(double amountOfProduct) {
        this.amountOfProduct = amountOfProduct;
    }

    public double getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(double priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
}
