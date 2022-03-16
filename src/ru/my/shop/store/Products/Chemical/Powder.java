package ru.my.shop.store.Products.Chemical;

public class Powder extends Chemicals {

    private String type; //для цветного или белого
    private String nameOfProduct = "Порошок";
    private float priceOfProduct = 420.2f;


    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }


    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }

}
