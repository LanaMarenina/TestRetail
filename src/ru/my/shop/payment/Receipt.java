package ru.my.shop.payment;

import ru.my.shop.Shop;
import ru.my.shop.client.order.Client;
import ru.my.shop.client.order.Order;
import ru.my.shop.store.Store;
import java.util.Date;

public class Receipt {

    private Date currentDate = new Date ();
    private Shop shop = new Shop();
    private Client client = new Client();
    private Order order = new Order();
    private Store store = new Store();


    public void printReceipt() {


        System.out.println("Информация о платеже:" + "\n" +
                "Дата покупки - " + currentDate + "\n" +
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

        System.out.println("Оплачено " + (order.getBreadAtOrderNum() * store.getBreadAtStore().getPriceOfProduct() + order.getMilkAtOrderNum() * store.getMilkAtStore().getPriceOfProduct() + order.getBeerAtOrderNum() * store.getBeerAtStore().getPriceOfProduct() + order.getJuiceAtOrderNum() * store.getJuiceAtStore().getPriceOfProduct() + order.getPowderAtOrderNum() * store.getPowderAtStore().getPriceOfProduct() + order.getSoapAtOrderNum() * store.getSoapAtStore().getPriceOfProduct()) + " рублей");
    }

}
