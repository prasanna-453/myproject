package com.neoteric.checkedException;

import com.neoteric.exception.InsufficientBalanceException;

import java.util.Date;
import java.util.UUID;
import java.util.function.BiPredicate;
import java.util.function.Function;

public abstract class SBITransferService implements RBIPayment{



        BiPredicate<String,Double> balanceCheck = (accountNumber, amt) -> {
            BankAccount accountBalance = SBIAccountDBService.accountMap.get(accountNumber);
            if (accountBalance != null &&  accountBalance.getBalance() > amt){
                return  true;
            }else {
                return  false;
            }

        };

        Function<Double,Payment> errorSupplier = (amount) -> {
            Payment p = new Payment();
            p.setStatus(PaymentStatusEnum.FAILED.getLabel());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
            p.setAmount(amount);
            return  p;
        };
        protected abstract boolean transactionLimitCheck(BankAccount account,Double amount);

        @Override
        public Payment transfer(String fromAccount, String toAccount, Double amount)  throws InsufficientBalanceException {
            Payment p = new Payment();
            // balance check
            if (balanceCheck.test(fromAccount,amount)) {
                BankAccount account =   SBIAccountDBService.accountMap.get(fromAccount);
                // transaction limit
                if(this.transactionLimitCheck(account,amount)) {
                    p.setStatus(PaymentStatusEnum.SUCCESS.getLabel());
                    p.setTransactionId(UUID.randomUUID().toString());
                    p.setUter(UUID.randomUUID().toString());
                    p.setTransactionDate(new Date());
                    p.setAmount(amount);

                    return  p;
                }else {

                    throw new InsufficientBalanceException("insufficientBalance Exception");

                }

            }else {
                return  errorSupplier.apply(amount);
            }

        }
    }


