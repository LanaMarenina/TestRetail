package ru.my.shop.store.Products.Chemical;

public class Powder extends Chemicals {

    private String type; //для цветного или белого
    private String nameOfProduct = "Порошок";
    private float priceOfProduct = 420.2f;

    public Powder(String nameOfProduct, float amountOfProduct, float priceOfProduct, String composition, float volume, String purposeOfUse, String type) {
        super(nameOfProduct, amountOfProduct, priceOfProduct, composition, volume, purposeOfUse);
        this.type = type;
    }

    public Powder(float priceOfProduct) {
        super(priceOfProduct);
    }

    public Powder() {

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
