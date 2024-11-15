package com.neoteric.checkedException;

public interface CorporateAccountService extends AccountService{

    BankAccount createAccount(String gst,String pan);
}
