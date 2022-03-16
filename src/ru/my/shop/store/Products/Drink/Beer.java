package ru.my.shop.store.Products.Drink;

public class Beer extends Alcohol{

    private String taste;
    private String nameOfProduct = "Пиво";
    private float priceOfProduct = 175.5f;

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }


    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }


}
