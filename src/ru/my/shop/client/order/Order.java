package ru.my.shop.client.order;

import ru.my.shop.store.Store;
import java.util.Scanner;

public class Order {

    private int breadAtOrderNum = 0;
    private int milkAtOrderNum = 0;
    private int beerAtOrderNum = 0;
    private int juiceAtOrderNum = 0;
    private int soapAtOrderNum = 0;
    private int powderAtOrderNum = 0;



    public Order(int breadAtOrderNum, int milkAtOrderNum, int beerAtOrderNum, int juiceAtOrderNum, int soapAtOrderNum, int powderAtOrderNum) {
        this.breadAtOrderNum = breadAtOrderNum;
        this.milkAtOrderNum = milkAtOrderNum;
        this.beerAtOrderNum = beerAtOrderNum;
        this.juiceAtOrderNum = juiceAtOrderNum;
        this.soapAtOrderNum = soapAtOrderNum;
        this.powderAtOrderNum = powderAtOrderNum;
    }

    public Order() {

    }

    boolean clientCheckedBread = true;
    boolean clientCheckedMilk = true;
    boolean clientCheckedBeer = false;
    boolean clientCheckedJuice = false;
    boolean clientCheckedSoap = true;
    boolean clientCheckedPowder = true;


    public int getBreadAtOrderNum() {
        return breadAtOrderNum;
    }

    public void setBreadAtOrderNum(int breadAtOrderNum) {
        this.breadAtOrderNum = breadAtOrderNum;
    }

    public int getMilkAtOrderNum() {
        return milkAtOrderNum;
    }

    public void setMilkAtOrderNum(int milkAtOrderNum) {
        this.milkAtOrderNum = milkAtOrderNum;
    }

    public int getBeerAtOrderNum() {
        return beerAtOrderNum;
    }

    public void setBeerAtOrderNum(int beerAtOrderNum) {
        this.beerAtOrderNum = beerAtOrderNum;
    }

    public int getJuiceAtOrderNum() {
        return juiceAtOrderNum;
    }

    public void setJuiceAtOrderNum(int juiceAtOrderNum) {
        this.juiceAtOrderNum = juiceAtOrderNum;
    }

    public int getSoapAtOrderNum() {
        return soapAtOrderNum;
    }

    public void setSoapAtOrderNum(int soapAtOrderNum) {
        this.soapAtOrderNum = soapAtOrderNum;
    }

    public int getPowderAtOrderNum() {
        return powderAtOrderNum;
    }

    public void setPowderAtOrderNum(int powderAtOrderNum) {
        this.powderAtOrderNum = powderAtOrderNum;
    }

    private Store store = new Store();

    private String breadAtOrderName = store.getBreadAtStore().getNameOfProduct();
    private String milkAtOrderName = store.getMilkAtStore().getNameOfProduct();
    private String beerAtOrderName = store.getBeerAtStore().getNameOfProduct();
    private String juiceAtOrderName = store.getJuiceAtStore().getNameOfProduct();
    private String powderAtOrderName = store.getPowderAtStore().getNameOfProduct();
    private String soapAtOrderName = store.getSoapAtStore().getNameOfProduct();

    public String getBreadAtOrderName() {
        return breadAtOrderName;
    }

    public void setBreadAtOrderName(String breadAtOrderName) {
        this.breadAtOrderName = breadAtOrderName;
    }

    public String getMilkAtOrderName() {
        return milkAtOrderName;
    }

    public void setMilkAtOrderName(String milkAtOrderName) {
        this.milkAtOrderName = milkAtOrderName;
    }

    public String getBeerAtOrderName() {
        return beerAtOrderName;
    }

    public void setBeerAtOrderName(String beerAtOrderName) {
        this.beerAtOrderName = beerAtOrderName;
    }

    public String getJuiceAtOrderName() {
        return juiceAtOrderName;
    }

    public void setJuiceAtOrderName(String juiceAtOrderName) {
        this.juiceAtOrderName = juiceAtOrderName;
    }

    public String getPowderAtOrderName() {
        return powderAtOrderName;
    }

    public void setPowderAtOrderName(String powderAtOrderName) {
        this.powderAtOrderName = powderAtOrderName;
    }

    public String getSoapAtOrderName() {
        return soapAtOrderName;
    }

    public void setSoapAtOrderName(String soapAtOrderName) {
        this.soapAtOrderName = soapAtOrderName;
    }

    public String formOrder() {


        if (clientCheckedBread) {
            System.out.println("Вы выбрали " + breadAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            breadAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + breadAtOrderNum + " " + breadAtOrderName);

        }

        if (clientCheckedMilk) {
            System.out.println("Вы выбрали " + milkAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            milkAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + milkAtOrderNum + " " + milkAtOrderName);

        }

        if (clientCheckedBeer) {
            System.out.println("Вы выбрали " + beerAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            beerAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + beerAtOrderNum + " " + beerAtOrderName);

        }

        if (clientCheckedJuice) {
            System.out.println("Вы выбрали " + juiceAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            juiceAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + juiceAtOrderNum + " " + juiceAtOrderName);

        }

        if (clientCheckedPowder) {
            System.out.println("Вы выбрали " + powderAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            powderAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + powderAtOrderNum + " " + powderAtOrderName);

        }

        if (clientCheckedSoap) {
            System.out.println("Вы выбрали " + soapAtOrderName + ". " + "Введите количество: ");
            Scanner a = new Scanner(System.in);
            soapAtOrderNum = a.nextInt();
            System.out.println("В корзину добавили " + soapAtOrderNum + " " + soapAtOrderName);

        }


        return "Заказ сформирован";


    }

    public void giveIdToOrder() {


    }

    public String showOrderToClient() {

        if (breadAtOrderNum > 0) {

            System.out.println(breadAtOrderNum + " " + store.getBreadAtStore().getNameOfProduct() + " - " + breadAtOrderNum * store.getBreadAtStore().getPriceOfProduct() + " рублей");

        }

        if (milkAtOrderNum > 0) {

            System.out.println(milkAtOrderNum + " " + store.getMilkAtStore().getNameOfProduct() + " - " + milkAtOrderNum * store.getMilkAtStore().getPriceOfProduct() + " рублей");

        }

        if (beerAtOrderNum > 0) {

            System.out.println(beerAtOrderNum + " " + store.getBeerAtStore().getNameOfProduct() + " - " + beerAtOrderNum * store.getBeerAtStore().getPriceOfProduct() + " рублей");

        }

        if (juiceAtOrderNum > 0) {

            System.out.println(juiceAtOrderNum + " " + store.getJuiceAtStore().getNameOfProduct() + " - " + juiceAtOrderNum * store.getJuiceAtStore().getPriceOfProduct() + " рублей");

        }

        if (powderAtOrderNum > 0) {

            System.out.println(powderAtOrderNum + " " + store.getPowderAtStore().getNameOfProduct() + " - " + powderAtOrderNum * store.getPowderAtStore().getPriceOfProduct() + " рублей");

        }

        if (soapAtOrderNum > 0) {

            System.out.println(soapAtOrderNum + " " + store.getSoapAtStore().getNameOfProduct() + " - " + soapAtOrderNum * store.getSoapAtStore().getPriceOfProduct() + " рублей");

        }

        return "Итого: " + (breadAtOrderNum * store.getBreadAtStore().getPriceOfProduct() + milkAtOrderNum * store.getMilkAtStore().getPriceOfProduct() + beerAtOrderNum * store.getBeerAtStore().getPriceOfProduct() + powderAtOrderNum * store.getPowderAtStore().getPriceOfProduct() + soapAtOrderNum * store.getSoapAtStore().getPriceOfProduct()) + " рублей";

    }





}
