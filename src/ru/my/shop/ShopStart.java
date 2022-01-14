package ru.my.shop;

import ru.my.shop.client.order.Client;
import ru.my.shop.client.order.Order;
import ru.my.shop.payment.Receipt;
import ru.my.shop.store.Store;


public class ShopStart {


    public static void main(String[] args) {

        Client client = new Client();
        client.openTheWeb();
        client.chooseProductsAtWeb();
        client.lookMyOrderAtWeb();

        Store store = new Store();
        System.out.println(store.countProductsAtStore());
        System.out.println(store.getProductsFromProvider());
        //System.out.println(store.countExistProductsAtStore());

        Receipt receipt = new Receipt();
        receipt.printReceipt();






    }





}
