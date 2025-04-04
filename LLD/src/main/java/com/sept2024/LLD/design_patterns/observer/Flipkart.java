package com.sept2024.LLD.design_patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    //Publisher
    //singleton

    private static Flipkart instance = null;

    private Flipkart(){}

    public static Flipkart getInstance() {
        if(instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    private List<OnOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();

    void registerSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.add(onOrderPlacedSubscriber);
    }

    void unRegisterSubscriber(OnOrderPlacedSubscriber onOrderPlacedSubscriber) {
        onOrderPlacedSubscribers.remove(onOrderPlacedSubscriber);
    }

    public void onOrderPlaced() {
        for (OnOrderPlacedSubscriber onOrderPlacedSubscriber: onOrderPlacedSubscribers) {
            onOrderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
