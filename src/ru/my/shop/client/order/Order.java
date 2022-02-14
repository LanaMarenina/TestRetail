package ru.my.shop.client.order;

import org.w3c.dom.ls.LSOutput;
import ru.my.shop.store.Products.Chemical.Powder;
import ru.my.shop.store.Products.Chemical.Soap;
import ru.my.shop.store.Products.Drink.Beer;
import ru.my.shop.store.Products.Drink.Juice;
import ru.my.shop.store.Products.Food.Bread;
import ru.my.shop.store.Products.Food.Milk;


import java.util.Scanner;

public class Order {

    private static int breadAtOrderNum = 0;
    private static int milkAtOrderNum = 0;
    private static int beerAtOrderNum = 0;
    private static int juiceAtOrderNum = 0;
    private static int soapAtOrderNum = 0;
    private static int powderAtOrderNum = 0;

    private Bread bread = new Bread();
    private Milk milk = new Milk();
    private Beer beer = new Beer();
    private Juice juice = new Juice();
    private Powder powder = new Powder();
    private Soap soap = new Soap();

    private String breadAtOrderName = bread.getNameOfProduct();
    private String milkAtOrderName = milk.getNameOfProduct();
    private String beerAtOrderName = beer.getNameOfProduct();
    private String juiceAtOrderName = juice.getNameOfProduct();
    private String powderAtOrderName = powder.getNameOfProduct();
    private String soapAtOrderName = soap.getNameOfProduct();

    boolean clientCheckedBread = true;
    boolean clientCheckedMilk = true;
    boolean clientCheckedBeer = false;
    boolean clientCheckedJuice = false;
    boolean clientCheckedSoap = false;
    boolean clientCheckedPowder = false;

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

        return "0";
    }

    public void giveIdToOrder() {


    }

    public void finalOrder() {

        if (breadAtOrderNum > 0) {

            System.out.println(breadAtOrderNum + " " + breadAtOrderName + " - " + breadAtOrderNum * bread.getPriceOfProduct() + " рублей");

        }

        if (milkAtOrderNum > 0) {

            System.out.println(milkAtOrderNum + " " + milkAtOrderName + " - " + milkAtOrderNum * milk.getPriceOfProduct() + " рублей");

        }

        if (beerAtOrderNum > 0) {

            System.out.println(beerAtOrderNum + " " + beerAtOrderName + " - " + beerAtOrderNum * beer.getPriceOfProduct() + " рублей");

        }

        if (juiceAtOrderNum > 0) {

            System.out.println(juiceAtOrderNum + " " + juiceAtOrderName + " - " + juiceAtOrderNum * juice.getPriceOfProduct() + " рублей");

        }

        if (powderAtOrderNum > 0) {

            System.out.println(powderAtOrderNum + " " + powderAtOrderName + " - " + powderAtOrderNum * powder.getPriceOfProduct() + " рублей");

        }

        if (soapAtOrderNum > 0) {

            System.out.println(soapAtOrderNum + " " + soapAtOrderName + " - " + soapAtOrderNum * soap.getPriceOfProduct() + " рублей");

        }

    }




}
