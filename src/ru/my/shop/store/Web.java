package ru.my.shop.store;

import ru.my.shop.store.Products.Food.Bread;

public class Web {

    private String nameOfWeb;
    private String webAddress;
    private Store store = new Store();
    private Bread bread = new Bread();

    public void showExistProductsFromStore() {

        System.out.println("На витрине " + store.getBreadAtStoreNum() + " " + store.getBreadAtStore().getNameOfProduct());

        System.out.println("На витрине " + store.getMilkAtStoreNum() + " " + store.getMilkAtStore().getNameOfProduct());

        System.out.println("На витрине " + store.getBeerAtStoreNum() + " " + store.getBeerAtStore().getNameOfProduct());

        System.out.println("На витрине " + store.getJuiceAtStoreNum() + " " + store.getJuiceAtStore().getNameOfProduct());

        System.out.println("На витрине " + store.getPowderAtStoreNum() + " " + store.getPowderAtStore().getNameOfProduct());

        System.out.println("На витрине " + store.getSoapAtStoreNum() + " " + store.getSoapAtStore().getNameOfProduct());



    }
}
