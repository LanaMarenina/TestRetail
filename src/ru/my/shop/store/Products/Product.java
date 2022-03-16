package ru.my.shop.store.Products;

import java.time.LocalDateTime;

public abstract class Product {

    private String nameOfProduct;
    private float amountOfProduct;
    private float priceOfProduct;
    private LocalDateTime dateOfUse;



    public String getNameOfProduct() {
        return nameOfProduct;
    }


    public float getPriceOfProduct() {
        return priceOfProduct;
    }

}
