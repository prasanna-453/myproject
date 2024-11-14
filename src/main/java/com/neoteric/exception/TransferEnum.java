package com.neoteric.exception;

public enum TransferEnum {
    INSUFFICIENT_BALANCE("101","Insufficient Balance");

    public String code;
    public String label;


    TransferEnum(String code, String label) {
        this.code=code;
        this.label=label;

    }

    public String getLabel() {
        return label;
    }

    public String getCode() {
        return code;
    }
}
