package ru.my.shop.store;

import ru.my.shop.client.order.Order;
import ru.my.shop.store.Products.Chemical.Powder;
import ru.my.shop.store.Products.Chemical.Soap;
import ru.my.shop.store.Products.Drink.Beer;
import ru.my.shop.store.Products.Drink.Juice;
import ru.my.shop.store.Products.Food.Bread;
import ru.my.shop.store.Products.Food.Milk;
import ru.my.shop.store.Products.Product;

import java.util.Scanner;

public class Store {


    private Product breadAtStore = new Bread();
    private int breadAtStoreNum = 10;
    private int breadFromProviderNum;

    private Product milkAtStore = new Milk();
    private int milkAtStoreNum = 10;
    private int milkFromProviderNum;

    private Product beerAtStore = new Beer();
    private int beerAtStoreNum = 10;
    private int beerFromProviderNum;

    private Product juiceAtStore = new Juice();
    private int juiceAtStoreNum = 10;
    private int juiceFromProviderNum;

    private Product powderAtStore = new Powder();
    private int powderAtStoreNum = 10;
    private int powderFromProviderNum;

    private Product soapAtStore = new Soap();
    private int soapAtStoreNum = 10;
    private int soapFromProviderNum;


    boolean bread = true; //provider brought bread = true
    boolean milk = false;
    boolean beer = false;
    boolean juice = false;
    boolean powder = false;
    boolean soap = false;

    private Order order = new Order();

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


    public String getProductsFromProvider() {

        if (bread) {

            System.out.println("Привезли " + breadAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            breadFromProviderNum = a.nextInt();
            System.out.println("На склад добавили " + breadAtStore.getNameOfProduct() + " - " + breadFromProviderNum + " ед.");

        }

        if (milk) {

            System.out.println("Привезли " + milkAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            milkFromProviderNum = a.nextInt();
            System.out.println("На складе добавили " + milkAtStore.getNameOfProduct() + " - " + milkFromProviderNum + " ед.");

        }

        if (beer) {

            System.out.println("Привезли " + beerAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            beerFromProviderNum = a.nextInt();
            System.out.println("На складе добавили " + beerAtStore.getNameOfProduct() + " - " + beerFromProviderNum + " ед.");

        }

        if (juice) {

            System.out.println("Привезли " + juiceAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            juiceFromProviderNum = a.nextInt();
            System.out.println("На складе добавили " + juiceAtStore.getNameOfProduct() + " - " + juiceFromProviderNum + " ед.");

        }

        if (powder) {

            System.out.println("Привезли " + powderAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            powderFromProviderNum = a.nextInt();
            System.out.println("На складе добавили " + powderAtStore.getNameOfProduct() + " - " + powderFromProviderNum + " ед.");


        }

        if (soap) {

            System.out.println("Привезли " + soapAtStore.getNameOfProduct() + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            soapFromProviderNum = a.nextInt();
            System.out.println("На складе добавили " + soapAtStore.getNameOfProduct() + " - " + soapFromProviderNum + " ед.");


        }

        return "Завоз окончен" + "\n";


    }

    public String countProductsAtStore() {
        System.out.println("На складе есть: ");

        if (breadAtStoreNum+breadFromProviderNum > 0) {
            System.out.println((breadAtStoreNum+breadFromProviderNum) + " ед. " + breadAtStore.getNameOfProduct() + " по цене - " + breadAtStore.getPriceOfProduct() + " рублей.");
        }

        if (milkAtStoreNum+milkFromProviderNum > 0) {
            System.out.println((milkAtStoreNum+milkFromProviderNum) + " ед. " + milkAtStore.getNameOfProduct() + " по цене - " + milkAtStore.getPriceOfProduct() + " рублей.");

        }

        if (beerAtStoreNum+beerFromProviderNum > 0) {
            System.out.println((beerAtStoreNum+beerFromProviderNum) + " ед. " + beerAtStore.getNameOfProduct() + " по цене - " + beerAtStore.getPriceOfProduct() + " рублей.");


        }

        if (juiceAtStoreNum+juiceFromProviderNum > 0) {
            System.out.println((juiceAtStoreNum+juiceFromProviderNum) + " ед. " + juiceAtStore.getNameOfProduct() + " по цене - " + juiceAtStore.getPriceOfProduct() + " рублей.");


        }

        if (powderAtStoreNum+powderFromProviderNum > 0) {
            System.out.println((powderAtStoreNum+powderFromProviderNum) + " ед. " + powderAtStore.getNameOfProduct() + " по цене - " + powderAtStore.getPriceOfProduct() + " рублей.");


        }

        if (soapAtStoreNum+soapFromProviderNum > 0) {
            System.out.println((soapAtStoreNum+soapFromProviderNum) + " ед. " + soapAtStore.getNameOfProduct() + " по цене - " + soapAtStore.getPriceOfProduct() + " рублей.");


        }

        return "Продукты посчитаны" + "\n";
    }


    public String countExistProductsAtStore() {

        breadAtStoreNum = breadAtStoreNum+breadFromProviderNum - order.getBreadAtOrderNum();
        System.out.println("На складе осталось " + breadAtStoreNum + " " + breadAtStore.getNameOfProduct());

        milkAtStoreNum = milkAtStoreNum+milkFromProviderNum - order.getMilkAtOrderNum();
        System.out.println("На складе осталось " + milkAtStoreNum + " " + milkAtStore.getNameOfProduct());

        beerAtStoreNum = beerAtStoreNum+beerFromProviderNum - order.getBeerAtOrderNum();
        System.out.println("На складе осталось " + beerAtStoreNum + " " + beerAtStore.getNameOfProduct());

        juiceAtStoreNum = juiceAtStoreNum+juiceFromProviderNum - order.getJuiceAtOrderNum();
        System.out.println("На складе осталось " + juiceAtStoreNum + " " + juiceAtStore.getNameOfProduct());

        powderAtStoreNum = powderAtStoreNum+powderFromProviderNum - order.getPowderAtOrderNum();
        System.out.println("На складе осталось " + powderAtStoreNum + " " + powderAtStore.getNameOfProduct());

        soapAtStoreNum = soapAtStoreNum+soapFromProviderNum - order.getSoapAtOrderNum();
        System.out.println("На складе осталось " + soapAtStoreNum + " " + soapAtStore.getNameOfProduct());

        return "Остатки посчитаны" + "\n";


    }

    public void formBasketFromOrder() {


    }

    public void sendBasketToDelivery() {


    }

}
