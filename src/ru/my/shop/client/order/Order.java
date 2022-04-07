package ru.my.shop.client.order;

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

    boolean clientCheckedBread = false;
    boolean clientCheckedMilk = false;
    boolean clientCheckedBeer = true;
    boolean clientCheckedJuice = true;
    boolean clientCheckedSoap = false;
    boolean clientCheckedPowder = false;


    private String breadAtOrderName = bread.getNameOfProduct();
    private String milkAtOrderName = milk.getNameOfProduct();
    private String beerAtOrderName = beer.getNameOfProduct();
    private String juiceAtOrderName = juice.getNameOfProduct();
    private String powderAtOrderName = powder.getNameOfProduct();
    private String soapAtOrderName = soap.getNameOfProduct();



    public int getBreadAtOrderNum() {
        return breadAtOrderNum;
    }

    public int getMilkAtOrderNum() {
        return milkAtOrderNum;
    }

    public int getBeerAtOrderNum() {
        return beerAtOrderNum;
    }

    public int getJuiceAtOrderNum() {
        return juiceAtOrderNum;
    }

    public int getSoapAtOrderNum() {
        return soapAtOrderNum;
    }

    public int getPowderAtOrderNum() {
        return powderAtOrderNum;
    }

    public String getBreadAtOrderName() {
        return breadAtOrderName;
    }

    public String getMilkAtOrderName() {
        return milkAtOrderName;
    }

    public String getBeerAtOrderName() {
        return beerAtOrderName;
    }

    public String getJuiceAtOrderName() {
        return juiceAtOrderName;
    }

    public String getPowderAtOrderName() {
        return powderAtOrderName;
    }

    public String getSoapAtOrderName() {
        return soapAtOrderName;
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
            System.out.println("Вы выбрали " + beerAtOrderName + ". " + "Введите ваш возраст: ");
            Scanner b = new Scanner(System.in);
            byte age = b.nextByte();
            if (age >= 21 && age < 100) {
                System.out.println("Введите количество " + beerAtOrderName + ": ");
                Scanner a = new Scanner(System.in);
                beerAtOrderNum = a.nextInt();
                System.out.println("В корзину добавили " + beerAtOrderNum + " " + beerAtOrderName);

            } else if (age < 21) {
                System.out.println("Продажа алкоголя несовершеннолетним запрещена");
            } else {
                System.out.println("Возраст введён неверно");
            }


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
