package ru.my.shop.store.Products.Drink;

public class Juice extends NonAlcohol {

    private String taste;
    private String nameOfProduct = "Сок";
    private float priceOfProduct = 120.2f;


    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }


    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }


}
