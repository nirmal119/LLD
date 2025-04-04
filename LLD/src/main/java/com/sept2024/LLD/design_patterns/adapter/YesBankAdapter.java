package com.sept2024.LLD.design_patterns.adapter;

public class YesBankAdapter implements BankApi{

     YesBankApi yesBankApi = new YesBankApi();;

//     public YesBankAdapter(YesBankApi yesBankApi) {
//         this.yesBankApi = new YesBankApi();
//     }

    @Override
    public double getBalance(String accountNumber) {
        return yesBankApi.findBalance(accountNumber);
    }

    @Override
    public boolean sendMoney(String fromAcc, String toAcc, double amount) {
        return false;
    }
}
