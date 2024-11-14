package Polymorphism;

import java.awt.*;

public enum PaymentStatus {




        success("Transaction is success"),
        failed("Transaction is failed"),
        pending("Transaction is in progress");

        private String label;

        PaymentStatus(String label) {
            this.label = label;
        }

            public String getlabel () {
                return label;

            }

            public void setlabel(String label) {
                this.label =label;
            }

 }
