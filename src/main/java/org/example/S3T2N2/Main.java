package org.example.S3T2N2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Callback
        Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar:
        targeta de crèdit, Paypal o deute en compte bancari.

        La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
        La classe que invoca la passarel·la de pagament serà una botiga de sabates.*/


        Scanner scan = new Scanner(System.in);
        ShoeStore Nike = new ShoeStore();
        BankAccountDebt methodDebtPayment = new BankAccountDebt(Nike);
        PayPal methodPayPal = new PayPal(Nike);
        CreditCar methodCreditCar = new CreditCar(Nike);
        int option;

        do {
            System.out.println("Choose payment method:\n" +
                    "1. Bank Account Dept.\n" +
                    "2. PayPal.\n" +
                    "3. Credit Card.");
            option = scan.nextInt();
            switch (option){
                case 1:
                    methodCreditCar.pay();
                    break;
                case 2:
                    methodPayPal.pay();
                    break;
                case 3:
                    methodCreditCar.pay();
                    break;
                default:
                    break;
            }
        }while(option != 0);
    }
}
