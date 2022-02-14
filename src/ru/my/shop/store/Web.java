package ru.my.shop.store;


import ru.my.shop.client.order.Order;

public class Web {

    private String nameOfWeb;
    private String webAddress;
    private Store store = new Store();
    private Order order = new Order();

    public void showExistProductsFromStore() {

        System.out.println("На витрине: "
                + "\n" + store.getBreadAtStoreNum() + " " + store.getBreadAtStore().getNameOfProduct()
                + "\n" + store.getMilkAtStoreNum() + " " + store.getMilkAtStore().getNameOfProduct()
                + "\n" + store.getBeerAtStoreNum() + " " + store.getBeerAtStore().getNameOfProduct()
                + "\n" + store.getJuiceAtStoreNum() + " " + store.getJuiceAtStore().getNameOfProduct()
                + "\n" + store.getPowderAtStoreNum() + " " + store.getPowderAtStore().getNameOfProduct()
                + "\n" + store.getSoapAtStoreNum() + " " + store.getSoapAtStore().getNameOfProduct());
    }

    public String formOrder() {

        order.formOrder();
        return "Заказ сформирован" + "\n";

    }


    public String showOrderToClient() {

        order.finalOrder();
        return "Итого: " + (order.getBreadAtOrderNum() * store.getBreadAtStore().getPriceOfProduct() + order.getMilkAtOrderNum() * store.getMilkAtStore().getPriceOfProduct() + order.getBeerAtOrderNum() * store.getBeerAtStore().getPriceOfProduct() + order.getPowderAtOrderNum() * store.getPowderAtStore().getPriceOfProduct() + order.getSoapAtOrderNum() * store.getSoapAtStore().getPriceOfProduct()) + " рублей" + "\n" ;


    }


}
