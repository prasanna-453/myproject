package com.neoteric.exception;

public class ExceptionTest {
    public void calculateWithFinally(int numberOfTickets)throws Exception{
        try {
            if (numberOfTickets>7){
                throw new  InsufficientBalanceException("insufficient balance exception");
            }
        }
        finally {
            System.out.println("code will execute"+TransferEnum.INSUFFICIENT_BALANCE.getLabel());
        }

    }


}
