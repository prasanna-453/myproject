package Polymorphism;

import java.util.*;
import java.util.function.BiPredicate;

public class PhonePay implements UPIPayments {

   public static Map<String,Double> accountBalanceMap = new HashMap<>();

    public static Map<String, ArrayList<Payments>> accountHistoryMap = new HashMap<>();


    static {
        accountBalanceMap.put("7815974005",10000.0);
        accountBalanceMap.put("6301412764",5000.0);

    }
    BiPredicate<String,Double>balanceCheck =(accountNumber,amt)->{
        Double accountBalance= accountBalanceMap.get(accountNumber);

        if (accountBalance>amt){
            return true;

        }else {
            return false;
        }
    };



    @Override
    public Payments transfer(String frommobileNo, String tomobileNo, Double amount) {

        Payments p = new Payments();
        if (balanceCheck.test(frommobileNo, amount)) {

            Double fromaccountBalance = accountBalanceMap.get(frommobileNo);
            Double toAccountBalance = accountBalanceMap.get(tomobileNo);

            Double fromTotalBalance = fromaccountBalance - amount;
            Double toTotalBalance = toAccountBalance + amount;
            accountBalanceMap.put(frommobileNo, fromTotalBalance);
            accountBalanceMap.put(tomobileNo, toTotalBalance);
            p.setStatus(PaymentStatus.success.getlabel());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());

            ArrayList<Payments> paymentsArrayList = accountHistoryMap.get(frommobileNo);

            if (paymentsArrayList !=null) {
                paymentsArrayList.add(p);
            }else {
                paymentsArrayList = new ArrayList<Payments>();
                paymentsArrayList.add(p);
                accountHistoryMap.put(frommobileNo,paymentsArrayList);

            }

        } else {
            p.setStatus(PaymentStatus.failed.getlabel());
            p.setTransactionId(UUID.randomUUID().toString());
            p.setUter(UUID.randomUUID().toString());
            p.setTransactionDate(new Date());
        }
        return p;

    }



}


