package com.neoteric.checkedException;

public interface RetailAccountService extends AccountService{

    BankAccount createAccount(String adhar,String pan);

}
