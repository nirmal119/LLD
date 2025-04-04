package com.sept2024.LLD.design_patterns.observer;

public class InvoiceGenerator implements OnOrderPlacedSubscriber {

    InvoiceGenerator() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating invoice");
    }
}
