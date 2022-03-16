package ru.my.shop.store.Products.Chemical;

public class Soap extends Chemicals {

    private String smell;
    private String nameOfProduct = "Мыло";
    private float priceOfProduct = 50.4f;

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }


    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }


}
