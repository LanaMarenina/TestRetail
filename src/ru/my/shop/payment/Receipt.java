package ru.my.shop.payment;

import ru.my.shop.Shop;
import ru.my.shop.client.order.Client;
import ru.my.shop.client.order.Order;

import java.time.LocalDateTime;

public class Receipt {

    private LocalDateTime dateOfShopping;
    private Shop shop = new Shop();
    private Client client = new Client();
    private Order order = new Order();


    public void printReceipt() {


        System.out.println("Информация о платеже:" + "\n" +
                "Название магазина - " + shop.getNameOfShop() + "\n" +
                "Адрес магазина - " + shop.getAddressOfShop() + "\n" +
                "Имя клиента - " + client.getNameOfClient() + "\n" +
                "Адрес клиента - " + client.getAddressOfClient() + "\n" +
                "Телефон клиента - " + client.getPhoneOfClient() + "\n" +
                "Заказ клиента: ");

        if (order.getBreadAtOrderNum() > 0) {
            System.out.println(order.getBreadAtOrderNum() + " " + order.getBreadAtOrderName());
        }
        if (order.getMilkAtOrderNum() > 0) {
            System.out.println(order.getMilkAtOrderNum() + " " + order.getMilkAtOrderName());
        }
        if (order.getBeerAtOrderNum() > 0) {
            System.out.println(order.getBeerAtOrderNum() + " " + order.getBeerAtOrderName());
        }
        if (order.getJuiceAtOrderNum() > 0) {
            System.out.println(order.getJuiceAtOrderNum() + " " + order.getJuiceAtOrderName());
        }
        if (order.getPowderAtOrderNum() > 0) {
            System.out.println(order.getPowderAtOrderNum() + " " + order.getPowderAtOrderName());
        }
        if (order.getSoapAtOrderNum() > 0) {
            System.out.println(order.getSoapAtOrderNum() + " " + order.getSoapAtOrderName());
        }
    }

}
