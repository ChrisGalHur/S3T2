package org.example.S3T2N2;

public class PayPal extends PaymentMethod{

    private ShoeBankAccount paypalPayment;

    public PayPal(ShoeBankAccount paypalPayment) {
        this.paypalPayment = paypalPayment;
    }
    public void pay(){
        System.out.println("Payed with PayPal.\n" +
                "WHAIT...");
        paypalPayment.payment();
    }
}
