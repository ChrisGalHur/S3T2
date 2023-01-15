package org.example.S3T2N2;

public class CreditCar extends PaymentMethod {
    private ShoeBankAccount creditCarPayment;

    public CreditCar(ShoeBankAccount creditCarPayment) {
        this.creditCarPayment = creditCarPayment;
    }

    public void pay(){
        System.out.println("Payed with credit car.\n" +
                "WHAIT...");
        creditCarPayment.payment();
    }
}
