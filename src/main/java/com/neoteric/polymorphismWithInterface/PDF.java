package com.neoteric.polymorphismWithInterface;

public class PDF implements ExportAccountSummary{
    @Override
    public String export(AccountSummery accountSummery) {

        System.out.println(" Export to PDF is done"+i);

        return "Data exported to PDF is done";

    }
}
