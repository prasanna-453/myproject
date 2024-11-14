package com.neoteric.exception;

public class PaymentService {

    static int seats=10;

    public String payment(int numberOfTickets)throws InsufficientBalanceException {
    try {
        if (numberOfTickets > 5) {
            throw new InsufficientBalanceException("insufficientbalance" );
        }
    }catch (InsufficientBalanceException e){
        System.out.println(" insufficient balance occured"+TransferEnum.INSUFFICIENT_BALANCE.getCode()+TransferEnum.INSUFFICIENT_BALANCE.getLabel());

    }
    return "success";

    }
}
