package ru.my.shop.store.Products.Food;

public class Milk extends DairyProducts {

    private float percentOfFat;
    private String nameOfProduct = "Молоко";
    private float priceOfProduct = 75.8f;

    public Milk(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, float percentOfFat) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume);
        this.percentOfFat = percentOfFat;
    }

    public Milk(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Milk() {
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
