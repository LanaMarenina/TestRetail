package ru.my.shop.payment;

import ru.my.shop.Shop;
import ru.my.shop.client.order.Order;
import ru.my.shop.delivery.Delivery;
import ru.my.shop.store.Stock;

import java.util.Scanner;
import java.util.Date;


public class Pay {

    private Date currentDate = new Date();
    private Shop shop = new Shop();

    private Stock stock = new Stock();
    private Order order = new Order();

    private Delivery deliveryNeed = new Delivery();
    private float sumOfOrder;
    private float sumOfDelivery = 200;

    public void getMoneyFromClient() {

        sumOfOrder = order.getBreadAtOrderNum() * stock.getBreadAtStore().getPriceOfProduct()
                + order.getMilkAtOrderNum() * stock.getMilkAtStore().getPriceOfProduct()
                + order.getBeerAtOrderNum() * stock.getBeerAtStore().getPriceOfProduct()
                + order.getJuiceAtOrderNum() * stock.getJuiceAtStore().getPriceOfProduct()
                + order.getPowderAtOrderNum() * stock.getPowderAtStore().getPriceOfProduct()
                + order.getSoapAtOrderNum() * stock.getSoapAtStore().getPriceOfProduct();

        System.out.println("Нужна ли вам доставка?");
        Scanner isDeliveryNeed = new Scanner(System.in);
        String delivery = isDeliveryNeed.next();

        if (delivery.equals("yes") || delivery.equals("Yes") || delivery.equals("Да") || delivery.equals("да")) {
            deliveryNeed.bringBasketToClient();
            float sumOfOrderWithDelivery = sumOfOrder + sumOfDelivery;
            System.out.println("К оплате за продукты " + sumOfOrder + " рублей. " + "\n"
                    + "Стоимость доставки " + sumOfDelivery + " рублей. " + "\n"
                    + "Итого: " + sumOfOrderWithDelivery + " рублей. " + "\n");
            checkCard();
            printReceiptWithDelivery();
        } else {
            System.out.println("К оплате " + sumOfOrder + " рублей. " + "\n");
            checkCard();
            printReceiptWithoutDelivery();
        }


    }


    private void checkCard() {
        System.out.println("Введите номер карты: ");
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();

        int[] cardNumber = new int[card.length()];
        for (int i = 0; i < cardNumber.length; i++) {
            cardNumber[i] = card.charAt(i);
        }
        if (cardNumber.length == 16) {
            if (cardNumber[0] == '2') {
                System.out.println("Платёжная система МИР. Оплата прошла" + "\n");

            } else if (cardNumber[0] == '4') {
                System.out.println("Платёжная система VISA. Оплата прошлаа" + "\n");

            } else if (cardNumber[0] == '5') {
                System.out.println("Платёжная система MasterCard. Оплата прошла" + "\n");

            } else if (cardNumber[0] == '6') {
                System.out.println("Платёжная система Maestro. Оплата прошла" + "\n");

            } else
                System.out.println("Ваша карта не принимается. Используйте другую" + "\n");

        } else
            System.out.println("Номер карты введён неверно" + "\n");
    }

    public void printReceiptWithDelivery() {

        System.out.println("Информация о платеже:" + "\n" +
                "Дата и время покупки - " + currentDate + "\n" +
                "Название магазина - " + shop.getNameOfShop() + "\n" +
                "Адрес магазина - " + shop.getAddressOfShop() + "\n" +
                "Требуется доставка по адресу - " + deliveryNeed.getAddressOfClient() + "\n" +
                "Телефон клиента - " + deliveryNeed.getPhoneOfClient() + "\n" +
                "Заказ клиента: ");

        if (order.getBreadAtOrderNum() > 0) {
            System.out.println(order.getBreadAtOrderNum() + " " + order.getBreadAtOrderName() + " - " + order.getBreadAtOrderNum()*stock.getBreadAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getMilkAtOrderNum() > 0) {
            System.out.println(order.getMilkAtOrderNum() + " " + order.getMilkAtOrderName() + " - " + order.getMilkAtOrderNum()*stock.getMilkAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getBeerAtOrderNum() > 0) {
            System.out.println(order.getBeerAtOrderNum() + " " + order.getBeerAtOrderName() + " - " + order.getBeerAtOrderNum()*stock.getBeerAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getJuiceAtOrderNum() > 0) {
            System.out.println(order.getJuiceAtOrderNum() + " " + order.getJuiceAtOrderName() + " - " + order.getJuiceAtOrderNum()*stock.getJuiceAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getPowderAtOrderNum() > 0) {
            System.out.println(order.getPowderAtOrderNum() + " " + order.getPowderAtOrderName() + " - " + order.getPowderAtOrderNum()*stock.getPowderAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getSoapAtOrderNum() > 0) {
            System.out.println(order.getSoapAtOrderNum() + " " + order.getSoapAtOrderName() + " - " + order.getSoapAtOrderNum()*stock.getSoapAtStore().getPriceOfProduct() + " рублей." );
        }

        System.out.println("Сумма заказа: " + sumOfOrder + " рублей." + "\n"+
                "Доставка: " + sumOfDelivery + " рублей." + "\n"+
                "Итого: " + (sumOfOrder + sumOfDelivery) + " рублей."+ "\n");


    }

    private void printReceiptWithoutDelivery() {

        System.out.println("Информация о платеже:" + "\n" +
                "Дата и время покупки - " + currentDate + "\n" +
                "Название магазина - " + shop.getNameOfShop() + "\n" +
                "Адрес магазина - " + shop.getAddressOfShop() + "\n" +
                "Самовывоз. Доставка не требуется" + "\n" +
                "Заказ клиента: ");

        if (order.getBreadAtOrderNum() > 0) {
            System.out.println(order.getBreadAtOrderNum() + " " + order.getBreadAtOrderName() + " - " + order.getBreadAtOrderNum()*stock.getBreadAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getMilkAtOrderNum() > 0) {
            System.out.println(order.getMilkAtOrderNum() + " " + order.getMilkAtOrderName() + " - " + order.getMilkAtOrderNum()*stock.getMilkAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getBeerAtOrderNum() > 0) {
            System.out.println(order.getBeerAtOrderNum() + " " + order.getBeerAtOrderName() + " - " + order.getBeerAtOrderNum()*stock.getBeerAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getJuiceAtOrderNum() > 0) {
            System.out.println(order.getJuiceAtOrderNum() + " " + order.getJuiceAtOrderName() + " - " + order.getJuiceAtOrderNum()*stock.getJuiceAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getPowderAtOrderNum() > 0) {
            System.out.println(order.getPowderAtOrderNum() + " " + order.getPowderAtOrderName() + " - " + order.getPowderAtOrderNum()*stock.getPowderAtStore().getPriceOfProduct() + " рублей." );
        }
        if (order.getSoapAtOrderNum() > 0) {
            System.out.println(order.getSoapAtOrderNum() + " " + order.getSoapAtOrderName() + " - " + order.getSoapAtOrderNum()*stock.getSoapAtStore().getPriceOfProduct() + " рублей." );
        }

        System.out.println("Итого: " + sumOfOrder + " рублей." + "\n");

    }


}
