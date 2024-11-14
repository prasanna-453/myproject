package com.neoteric.exception;

public class privacyServiceTest {

    public static void main(String[]args){
        PaymentService paymentService=new PaymentService();
        try {


            paymentService.payment(6);
        }catch (InsufficientBalanceException e){

            System.out.println(TransferEnum.INSUFFICIENT_BALANCE.getCode()+TransferEnum.INSUFFICIENT_BALANCE.getLabel());

        }
        finally {
            System.out.println("what ever it is finalblock will execute");
        }
    }
}
