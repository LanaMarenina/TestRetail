package ru.my.shop.delivery;

import java.util.Scanner;

public class Delivery {

    private String nameOfDelivery;
    private int phoneOfDelivery;
    private String addressOfClient;
    private String phoneOfClient;



    public void bringBasketToClient() {

        System.out.println("Напишите свой адрес: ");
        Scanner askAddress = new Scanner(System.in);
        addressOfClient = askAddress.next();

        System.out.println("Напишите свой телефон: ");
        Scanner askPhone = new Scanner(System.in);
        phoneOfClient = askPhone.next();




    }

    public String getAddressOfClient() {
        return addressOfClient;
    }

    public String getPhoneOfClient() {
        return phoneOfClient;
    }
}
