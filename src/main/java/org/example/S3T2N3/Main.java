package org.example.S3T2N3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Dependency Injection
        Dissenya una classe que mostri en pantalla el preu de diversos articles.
        Ja que haurà de mostrar-los també en diversos tipus de moneda.

        Important
        Assegura't d'afegir-li com a Injecció de Dependència una classe Convertidor de Moneda que efectuï la correcció del preu
        en funció del canvi de divisa.*/

        Scanner scan = new Scanner(System.in);
        WebPage tinyShop = new WebPage("Candy's Dolores Muelas");
        EuroCurrency euroMain = new EuroCurrency();
        DolarCurrency dolarMain = new DolarCurrency();
        ArgentinePesoCurrency argentinePesoCurrency = new ArgentinePesoCurrency();

        double[] prices = {7.7, 87.65, 95.98};
        String currencyString;
        int optionCurrency;


        do{
            System.out.println("What currency do you want?\n" +
                    "1- Euro.\n" +
                    "2- Dolar.\n" +
                    "3- Argentine Peso.\n" +
                    "0- Exit.");
            optionCurrency = scan.nextInt();

            switch (optionCurrency) {
                case 1:
                    currencyString = "euros";
                    tinyShop.printPrices(euroMain, prices, currencyString);
                    break;
                case 2:
                    currencyString = "dolar";
                    tinyShop.printPrices(dolarMain, prices, currencyString);
                    break;
                case 3:
                    currencyString = "argentine peso";
                    tinyShop.printPrices(argentinePesoCurrency, prices, currencyString);
                    break;
                default :
                    break;
            }
        }while (optionCurrency != 0);
    }
}
