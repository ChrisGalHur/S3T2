package org.example.S3T2N1;

import java.util.ArrayList;

public class StockBroker implements Observable{
    private ArrayList<Observer> observersStockBroker;
    private String name;
    public StockBroker(String name) {
        this.name = name;
        observersStockBroker = new ArrayList<Observer>();
    }

    public ArrayList<Observer> getObserversStockBroker() {
        return observersStockBroker;
    }

    public void stocksChanges(){
        System.out.println(this.name + " has detected changes in stocks.");
        call();
    }
    public void linkObsrver(Observer o){
        observersStockBroker.add(o);
    }
    @Override
    public void call() {
        for (Observer n: observersStockBroker) {
            n.update();
        }
    }
}
