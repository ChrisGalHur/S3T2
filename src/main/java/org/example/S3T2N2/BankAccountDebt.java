package org.example.S3T2N2;

public class BankAccountDebt extends PaymentMethod{
    private ShoeBankAccount bankAccountPayment;

    public BankAccountDebt(ShoeBankAccount bankAccountPayment) {
        this.bankAccountPayment = bankAccountPayment;
    }
    public void pay(){
        System.out.println("Payed with bank account debt.\n" +
                "WHAIT...");
        bankAccountPayment.payment();
    }
}
