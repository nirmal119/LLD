package com.sept2024.LLD.design_patterns.adapter;

public class PhonePe {
    public static void main(String[] args) {

        BankApi bankApi = new YesBankAdapter();

        String rajatAccNo = "1234";
        String akashAccNo = "56744";

        double amount = 100.0;

        bankApi.sendMoney(rajatAccNo, akashAccNo,amount);
    }
}
