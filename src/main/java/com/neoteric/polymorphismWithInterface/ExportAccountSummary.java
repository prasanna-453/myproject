package com.neoteric.polymorphismWithInterface;

public interface ExportAccountSummary {
    //when there are many forms but  no common functionalities we use interface
    //open for extention closed for modification
    //contract

    int i=10;

    public abstract String export(AccountSummery accountSummery);
           //AccountSummery class is a encapsulatedclass because it has private and public data
           //abstract is modifier
           //public is specifier



}
