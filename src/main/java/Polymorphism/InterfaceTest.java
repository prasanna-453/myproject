package Polymorphism;

public class InterfaceTest {

    public static void main(String[]args){
        UPIPayments payments=new PhonePay();
        Payments pay =payments.transfer("7815974005","6301412764",30000.0);
        System.out.println(pay.getTransactionId()+"status"+pay.getStatus()+"uter"+pay.getUter()+"Date"+pay.getTransactionId());

        System.out.println("Balance of from account"+PhonePay.accountBalanceMap.get("7815974005"));
        System.out.println("Balance of to account"+PhonePay.accountBalanceMap.get("6301412764"));
    }
}
