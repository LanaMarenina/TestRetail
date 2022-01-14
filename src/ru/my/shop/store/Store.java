package ru.my.shop.store;

import ru.my.shop.client.order.Order;
import ru.my.shop.store.Products.Chemical.Powder;
import ru.my.shop.store.Products.Chemical.Soap;
import ru.my.shop.store.Products.Drink.Beer;
import ru.my.shop.store.Products.Drink.Juice;
import ru.my.shop.store.Products.Food.Bread;
import ru.my.shop.store.Products.Food.Milk;
import ru.my.shop.store.Products.Product;

public class Store {


    private Product breadAtStore = new Bread("Хлеб", 25.1);
    private int breadAtStoreNum = 12;

    private Product milkAtStore = new Milk("Молоко", 75.8);
    private int milkAtStoreNum = 13;

    private Product beerAtStore = new Beer("Пиво", 175.5);
    private int beerAtStoreNum = 14;

    private Product juiceAtStore = new Juice("Сок", 120.2);
    private int juiceAtStoreNum = 15;

    private Product powderAtStore = new Powder("Порошок", 420.2);
    private int powderAtStoreNum = 16;

    private Product soapAtStore = new Soap("Мыло", 50.4);
    private int soapAtStoreNum = 17;


    boolean bread = true; //provider brought bread = true
    boolean milk = true;
    boolean beer = true;
    boolean juice = true;
    boolean powder = true;
    boolean soap = true;

    public Product getBreadAtStore() {
        return breadAtStore;
    }

    public void setBreadAtStore(Product breadAtStore) {
        this.breadAtStore = breadAtStore;
    }

    public Product getMilkAtStore() {
        return milkAtStore;
    }

    public void setMilkAtStore(Product milkAtStore) {
        this.milkAtStore = milkAtStore;
    }

    public Product getBeerAtStore() {
        return beerAtStore;
    }

    public void setBeerAtStore(Product beerAtStore) {
        this.beerAtStore = beerAtStore;
    }

    public Product getJuiceAtStore() {
        return juiceAtStore;
    }

    public void setJuiceAtStore(Product juiceAtStore) {
        this.juiceAtStore = juiceAtStore;
    }

    public Product getPowderAtStore() {
        return powderAtStore;
    }

    public void setPowderAtStore(Product powderAtStore) {
        this.powderAtStore = powderAtStore;
    }

    public Product getSoapAtStore() {
        return soapAtStore;
    }

    public void setSoapAtStore(Product soapAtStore) {
        this.soapAtStore = soapAtStore;
    }

    public int getBreadAtStoreNum() {
        return breadAtStoreNum;
    }

    public void setBreadAtStoreNum(int breadAtStoreNum) {
        this.breadAtStoreNum = breadAtStoreNum;
    }

    public int getMilkAtStoreNum() {
        return milkAtStoreNum;
    }

    public void setMilkAtStoreNum(int milkAtStoreNum) {
        this.milkAtStoreNum = milkAtStoreNum;
    }

    public int getBeerAtStoreNum() {
        return beerAtStoreNum;
    }

    public void setBeerAtStoreNum(int beerAtStoreNum) {
        this.beerAtStoreNum = beerAtStoreNum;
    }

    public int getJuiceAtStoreNum() {
        return juiceAtStoreNum;
    }

    public void setJuiceAtStoreNum(int juiceAtStoreNum) {
        this.juiceAtStoreNum = juiceAtStoreNum;
    }

    public int getPowderAtStoreNum() {
        return powderAtStoreNum;
    }

    public void setPowderAtStoreNum(int powderAtStoreNum) {
        this.powderAtStoreNum = powderAtStoreNum;
    }

    public int getSoapAtStoreNum() {
        return soapAtStoreNum;
    }

    public void setSoapAtStoreNum(int soapAtStoreNum) {
        this.soapAtStoreNum = soapAtStoreNum;
    }


    public String countProductsAtStore() {
        if (breadAtStoreNum > 0) {
            System.out.println("На складе есть " + breadAtStoreNum + " ед. " + breadAtStore.getNameOfProduct() + " по цене - " + breadAtStore.getPriceOfProduct() + " рублей.");

        }

        if (milkAtStoreNum > 0) {
            System.out.println("На складе есть " + milkAtStoreNum + " ед. " + milkAtStore.getNameOfProduct() + " по цене - " + milkAtStore.getPriceOfProduct() + " рублей.");

        }

        if (beerAtStoreNum > 0) {
            System.out.println("На складе есть " + beerAtStoreNum + " ед. " + beerAtStore.getNameOfProduct() + " по цене - " + beerAtStore.getPriceOfProduct() + " рублей.");


        }

        if (juiceAtStoreNum > 0) {
            System.out.println("На складе есть " + juiceAtStoreNum + " ед. " + juiceAtStore.getNameOfProduct() + " по цене - " + juiceAtStore.getPriceOfProduct() + " рублей.");


        }

        if (powderAtStoreNum > 0) {
            System.out.println("На складе есть " + powderAtStoreNum + " ед. " + powderAtStore.getNameOfProduct() + " по цене - " + powderAtStore.getPriceOfProduct() + " рублей.");


        }

        if (soapAtStoreNum > 0) {
            System.out.println("На складе есть " + soapAtStoreNum + " ед. " + soapAtStore.getNameOfProduct() + " по цене - " + soapAtStore.getPriceOfProduct() + " рублей.");


        }

        return "Продукты посчитаны";
    }

    public String getProductsFromProvider() {

        if (bread) {
            Product breadFromProvider = new Bread();
            breadFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + breadAtStore.getNameOfProduct() + " - " + breadFromProvider.getAmountOfProduct() + " ед.");
            breadAtStoreNum++;
        }

        if (milk) {
            Product milkFromProvider = new Milk();
            ;
            milkFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + milkAtStore.getNameOfProduct() + " - " + milkFromProvider.getAmountOfProduct() + " ед.");
            milkAtStoreNum++;


        }

        if (beer) {
            Product beerFromProvider = new Beer();
            beerFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + beerAtStore.getNameOfProduct() + " - " + beerFromProvider.getAmountOfProduct() + " ед.");
            beerAtStoreNum++;


        }

        if (juice) {
            Product juiceFromProvider = new Juice();
            juiceFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + juiceAtStore.getNameOfProduct() + " - " + juiceFromProvider.getAmountOfProduct() + " ед.");
            juiceAtStoreNum++;


        }

        if (powder) {
            Product powderFromProvider = new Powder();
            powderFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + powderAtStore.getNameOfProduct() + " - " + powderFromProvider.getAmountOfProduct() + " ед.");
            powderAtStoreNum++;


        }

        if (soap) {
            Product soapFromProvider = new Soap();
            soapFromProvider.setPriceOfProduct(50.4);
            soapFromProvider.setAmountOfProduct(1);
            System.out.println("На склад привезли " + soapAtStore.getNameOfProduct() + " - " + soapFromProvider.getAmountOfProduct() + " ед.");
            soapAtStoreNum++;


        }

        return "На складе стало " + breadAtStoreNum + " ед. " + breadAtStore.getNameOfProduct() + "\n" +
                "На складе стало " + milkAtStoreNum + " ед. " + milkAtStore.getNameOfProduct() + "\n" +
                "На складе стало " + beerAtStoreNum + " ед. " + beerAtStore.getNameOfProduct() + "\n" +
                "На складе стало " + juiceAtStoreNum + " ед. " + juiceAtStore.getNameOfProduct() + "\n" +
                "На складе стало " + powderAtStoreNum + " ед. " + powderAtStore.getNameOfProduct() + "\n" +
                "На складе стало " + soapAtStoreNum + " ед. " + soapAtStore.getNameOfProduct();


    }
    /*private Order order = new Order();

    public String countExistProductsAtStore() {

        breadAtStoreNum = breadAtStoreNum - order.getBreadAtOrderNum();
        System.out.println("На складе осталось " + breadAtStoreNum + breadAtStore.getNameOfProduct());

        milkAtStoreNum = milkAtStoreNum - order.getMilkAtOrderNum();
        System.out.println("На складе осталось " + milkAtStoreNum + milkAtStore.getNameOfProduct());

        beerAtStoreNum = beerAtStoreNum - order.getBeerAtOrderNum();
        System.out.println("На складе осталось " + beerAtStoreNum + beerAtStore.getNameOfProduct());

        juiceAtStoreNum = juiceAtStoreNum - order.getJuiceAtOrderNum();
        System.out.println("На складе осталось " + juiceAtStoreNum + juiceAtStore.getNameOfProduct());

        powderAtStoreNum = powderAtStoreNum - order.getPowderAtOrderNum();
        System.out.println("На складе осталось " + powderAtStoreNum + powderAtStore.getNameOfProduct());

        soapAtStoreNum = soapAtStoreNum - order.getSoapAtOrderNum();
        System.out.println("На складе осталось " + soapAtStoreNum + soapAtStore.getNameOfProduct());

        return "Продукты посчитаны";


    }*/

    public void formBasketFromOrder() {


    }

    public void sendBasketToDelivery() {


    }

}
