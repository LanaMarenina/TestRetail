package ru.my.shop.store.Products.Food;

import ru.my.shop.store.Products.Product;

public class Bread extends Bakery {

    private String type; //ржаной, пшеничный...
    private String nameOfProduct = "Хлеб";
    private float priceOfProduct = 25.1f;

    public Bread(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float weight, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, weight);
        this.type = type;
    }

    public Bread(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Bread() {
    }

    @Override
    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public float getPriceOfProduct() {
        return priceOfProduct;
    }

    @Override
    public void setPriceOfProduct(float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }
}
