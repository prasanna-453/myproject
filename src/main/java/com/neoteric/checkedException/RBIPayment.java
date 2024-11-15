package com.neoteric.checkedException;

import com.neoteric.exception.InsufficientBalanceException;

public interface RBIPayment {

    Payment transfer (String fromAccount,String toAccount,Double amount) throws InsufficientBalanceException;

}
