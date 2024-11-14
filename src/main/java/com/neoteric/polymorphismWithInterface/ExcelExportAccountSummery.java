package com.neoteric.polymorphismWithInterface;

public class ExcelExportAccountSummery implements ExportAccountSummary {
    @Override
    public String export(AccountSummery accountSummery) {

        System.out.println(" Export to excel is done"+i);
        return "Data exported to excel is done";
    }

    public void test(){

    }
}
