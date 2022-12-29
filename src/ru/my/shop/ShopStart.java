package ru.my.shop;

import ru.my.shop.client.order.Client;
import ru.my.shop.store.Stock;


public class ShopStart {


    public static void main(String[] args) {


        Client client = new Client();
        client.openTheSite();
        client.makeOrder();
        client.lookMyOrderAtBasket();
        client.payForOrder();

        Stock stock = new Stock();
        System.out.println(stock.getProductsFromProvider());
        System.out.println(stock.countProductsAtStore());
        System.out.println(stock.countExistProductsAtStore());


    }


}
