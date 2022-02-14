package ru.my.shop.store.Products.Drink;

public class Juice extends NonAlcohol {

    private String taste;
    private String nameOfProduct = "Сок";
    private float priceOfProduct = 120.2f;

    public Juice(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, String type, String taste) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, type);
        this.taste = taste;
    }

    public Juice(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Juice() {

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
