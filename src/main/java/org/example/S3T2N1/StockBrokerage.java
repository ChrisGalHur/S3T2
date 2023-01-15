package org.example.S3T2N1;

public class StockBrokerage implements Observer {
    private String name;

    public StockBrokerage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(this.name + " has made changes in his stocks.");
    }
}
