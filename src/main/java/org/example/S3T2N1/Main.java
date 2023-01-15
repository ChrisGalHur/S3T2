package org.example.S3T2N1;

public class Main {
    public static void main(String[] args) {
        /*Observer
        Dissenya un sistema en el qual un Agent de Borsa (Observable) notifica a diverses agències de Borsa (Observers)
        canvis quan la Borsa puja o baixa.
        És necessari que l'objecte Observable mantingui referències als Observers.*/

        StockBroker StockBroker1 = new StockBroker("Michael Burry");
        StockBrokerage StockBrokerage1 = new StockBrokerage("Indexa Capital");
        StockBrokerage StockBrokerage2 = new StockBrokerage("Mani Tawani");

        StockBroker1.linkObsrver(StockBrokerage1);
        StockBroker1.linkObsrver(StockBrokerage2);
        StockBroker1.stocksChanges();

    }
}