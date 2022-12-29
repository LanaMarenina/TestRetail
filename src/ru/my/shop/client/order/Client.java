package ru.my.shop.client.order;

import ru.my.shop.payment.Pay;
import ru.my.shop.store.ShopSite;

import java.util.Scanner;


public class Client {

    private String nameOfClient;

    private ShopSite shopSite = new ShopSite();
    private Order order = new Order();
    private Pay pay = new Pay();

    public String getNameOfClient() {
        System.out.println("Добро пожаловать в наш магазин! Введите ваше имя: ");
        Scanner askName = new Scanner(System.in);
        nameOfClient = askName.next();
        return nameOfClient;
    }


    public void openTheSite() {
        getNameOfClient();
        shopSite.showExistProductsFromStore();

    }

    public void makeOrder() {

        System.out.println(order.formOrder());

    }

    public void lookMyOrderAtBasket() {

        System.out.println(order.finalOrder());

    }

    public void payForOrder() {

        pay.getMoneyFromClient();

    }

}
