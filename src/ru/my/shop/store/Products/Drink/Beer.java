package ru.my.shop.store.Products.Drink;

public class Beer extends Alcohol{

    private String taste;
    private String nameOfProduct = "Пиво";
    private float priceOfProduct = 175.5f;

    public Beer(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, float percentOfAlcohol, String taste) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, percentOfAlcohol);
        this.taste = taste;
    }

    public Beer(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Beer() {

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
