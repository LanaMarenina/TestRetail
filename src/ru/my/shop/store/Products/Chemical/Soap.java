package ru.my.shop.store.Products.Chemical;

public class Soap extends Chemicals {

    private String smell;
    private String nameOfProduct = "Мыло";
    private float priceOfProduct = 50.4f;

    public Soap(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, String purposeOfUse, String smell) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, purposeOfUse);
        this.smell = smell;
    }

    public Soap(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Soap() {

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
