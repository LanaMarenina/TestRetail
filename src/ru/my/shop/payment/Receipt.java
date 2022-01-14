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

    private int breadFromOrderNum = order.getBreadAtOrderNum();
    private String breadFromOrderName = order.getBreadAtOrderName();

    private int milkFromOrderNum = order.getMilkAtOrderNum();
    private String milkFromOrderName = order.getMilkAtOrderName();

    private int beerFromOrderNum = order.getBeerAtOrderNum();
    private String beerFromOrderName = order.getBeerAtOrderName();

    private int juiceFromOrderNum = order.getJuiceAtOrderNum();
    private String juiceFromOrderName = order.getJuiceAtOrderName();

    private int soapFromOrderNum = order.getSoapAtOrderNum();
    private String soapFromOrderName = order.getSoapAtOrderName();

    private int powderFromOrderNum = order.getPowderAtOrderNum();
    private String powderFromOrderName = order.getPowderAtOrderName();


    public void printReceipt() {

        System.out.println("Информация о платеже:" + "\n" +
                "Название магазина - " + shop.getNameOfShop() + "\n" +
                "Адрес магазина - " + shop.getAddressOfShop() + "\n" +
                "Имя клиента - " + client.getNameOfClient() + "\n" +
                "Адрес клиента - " + client.getAddressOfClient() + "\n" +
                "Телефон клиента - " + client.getPhoneOfClient() + "\n" +
                "Заказ клиента: " + "\n");

        if (breadFromOrderNum > 0) {
            System.out.println(breadFromOrderNum + " " + breadFromOrderName + "\n");
        }

        if (milkFromOrderNum > 0) {
            System.out.println(milkFromOrderNum + " " + milkFromOrderName + "\n");
        }

        if (beerFromOrderNum > 0) {
            System.out.println(beerFromOrderNum + " " + beerFromOrderName + "\n");
        }

        if (juiceFromOrderNum > 0) {
            System.out.println(juiceFromOrderNum + " " + juiceFromOrderName + "\n");
        }

        if (powderFromOrderNum > 0) {
            System.out.println(powderFromOrderNum + " " + powderFromOrderName + "\n");
        }

        if (soapFromOrderNum > 0) {
            System.out.println(soapFromOrderNum + " " + soapFromOrderName + "\n");
        }

    }

}
