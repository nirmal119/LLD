package com.sept2024.LLD.design_patterns.adapter;

public class ICICIBankAdapter implements BankApi{

    ICICIBankApi iciciBankApi = new ICICIBankApi();

    @Override
    public double getBalance(String accountNumber) {
        return iciciBankApi.findBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        return false;
    }
}
