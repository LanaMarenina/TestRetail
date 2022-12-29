package ru.my.shop.store;

public class ShopSite {

    private String nameOfWeb;
    private String webAddress;
    private Stock stock = new Stock();

    public void showExistProductsFromStore() {

        System.out.println("Сейчас на витрине: "
                + "\n" + stock.getBreadAtStoreNum() + " " + stock.getBreadAtStore().getNameOfProduct()
                + "\n" + stock.getMilkAtStoreNum() + " " + stock.getMilkAtStore().getNameOfProduct()
                + "\n" + stock.getBeerAtStoreNum() + " " + stock.getBeerAtStore().getNameOfProduct()
                + "\n" + stock.getJuiceAtStoreNum() + " " + stock.getJuiceAtStore().getNameOfProduct()
                + "\n" + stock.getPowderAtStoreNum() + " " + stock.getPowderAtStore().getNameOfProduct()
                + "\n" + stock.getSoapAtStoreNum() + " " + stock.getSoapAtStore().getNameOfProduct());

        System.out.println("Сайт загружен" + "\n");
    }



}

