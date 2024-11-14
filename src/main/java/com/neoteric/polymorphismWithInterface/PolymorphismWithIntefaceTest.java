package com.neoteric.polymorphismWithInterface;

public class PolymorphismWithIntefaceTest {

    public static void main(String[]args){

        ExportAccountSummary excelExportAccountSummery=new ExcelExportAccountSummery() ;
        //up casting we assaign sub class as a reference to superclass
        excelExportAccountSummery.export(new AccountSummery());


        ExportAccountSummary pdf=new PDF() ;
        pdf.export(new AccountSummery());


    }
}
