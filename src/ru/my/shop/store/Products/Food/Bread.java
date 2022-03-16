package ru.my.shop.store.Products.Food;

import ru.my.shop.store.Products.Product;

public class Bread extends Bakery {

    private String type; //ржаной, пшеничный...
    private String nameOfProduct = "Хлеб";
    private float priceOfProduct = 25.1f;


    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }


}
