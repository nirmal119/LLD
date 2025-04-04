package com.sept2024.LLD.design_patterns.adapter;

public interface BankApi {
    double getBalance(String accountNumber);

    boolean sendMoney(String fromAcc, String toAcc, double amount);
}


