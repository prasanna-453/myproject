package com.neoteric.checkedException;


import java.util.UUID;

public class RetailAccountServiceImpl implements RetailAccountService {


    public BankAccount createAccount(String adhar, String pan) {

        BankAccount account = new BankAccount();
        account.setAccount(UUID.randomUUID().toString());
        account.setBalance(1000000.0);
        account.setAdhar(adhar);
        account.setPan(pan);
        SBIAccountDBService.accountMap.put(account.getAccount(),account);
        return account;



        }

}
