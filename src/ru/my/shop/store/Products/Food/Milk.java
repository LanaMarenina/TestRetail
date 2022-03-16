package ru.my.shop.store.Products.Food;

public class Milk extends DairyProducts {

    private float percentOfFat;
    private String nameOfProduct = "Молоко";
    private float priceOfProduct = 75.8f;


    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }


}
