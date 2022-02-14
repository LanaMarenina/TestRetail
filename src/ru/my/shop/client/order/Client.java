package ru.my.shop.client.order;

import ru.my.shop.store.Web;

public class Client {

    private String nameOfClient = "Морозова Лена";
    private String addressOfClient = "Москва, ул. Строителей, 123";
    private String phoneOfClient = "8-900-123-45-67";
    private int cardNumber;
    private Web web = new Web();


    public Client(String nameOfClient, String addressOfClient, String phoneOfClient) {
        this.nameOfClient = nameOfClient;
        this.addressOfClient = addressOfClient;
        this.phoneOfClient = phoneOfClient;
    }

    public Client() {

    }


    public String getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public String getAddressOfClient() {
        return addressOfClient;
    }

    public void setAddressOfClient(String addressOfClient) {
        this.addressOfClient = addressOfClient;
    }

    public String getPhoneOfClient() {
        return phoneOfClient;
    }

    public void setPhoneOfClient(String phoneOfClient) {
        this.phoneOfClient = phoneOfClient;
    }


    public void openTheWeb() {

        web.showExistProductsFromStore();
        System.out.println("Сайт загружен" + "\n");

    }

    public void chooseProductsAtWeb() {

        System.out.println(web.formOrder());

    }


    public void lookMyOrderAtWeb() {

        System.out.println("Ваш заказ: ");
        System.out.println(web.showOrderToClient());


    }

    public void payForOrder() {


    }

    public void chooseDelivery() {


    }


}
