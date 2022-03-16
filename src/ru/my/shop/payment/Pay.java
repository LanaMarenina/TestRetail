package ru.my.shop.payment;

import java.util.Scanner;


public class Pay {


    public void getMoneyFromClient() {

        System.out.println("Введите номер карты: ");
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();

        int[] cardNumber = new int[card.length()];
        for (int i = 0; i < cardNumber.length; i++) {
            cardNumber[i] = card.charAt(i);
        }
        if (cardNumber.length == 16) {
            if (cardNumber[0] == '2') {
                System.out.println("Платёжная система МИР. Карта принята" + "\n");

            } else if (cardNumber[0] == '4') {
                System.out.println("Платёжная система VISA. Карта принята" + "\n");
            } else if (cardNumber[0] == '5') {
                System.out.println("Платёжная система MasterCard. Карта принята" + "\n");
            } else if (cardNumber[0] == '6') {
                System.out.println("Платёжная система Maestro. Карта принята" + "\n");
            } else
                System.out.println("Ваша карта не принимается. Используйте другую" + "\n");
        } else
            System.out.println("Номер карты введён неверно" + "\n");

    }



}
