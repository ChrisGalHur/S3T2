package org.example.S3T2N3;

import java.lang.reflect.Array;
import java.util.List;

public class WebPage {
    String name;

    public WebPage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printPrices(Currency currencyShow, double[] pricesShow, String currencyType){
        double priceShow;
        System.out.println("The prices of this articles in " + currencyType + " are:");
        for (int i = 0; i < pricesShow.length; i++){
            priceShow = pricesShow[i] * currencyShow.changeCurrency();
            System.out.println("-" + priceShow);
        }
    }
}
