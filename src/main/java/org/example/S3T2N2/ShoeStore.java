package org.example.S3T2N2;

public class ShoeStore implements ShoeBankAccount{
    @Override
    public void payment() {
        System.out.println("Payment has been received.");
    }
}
