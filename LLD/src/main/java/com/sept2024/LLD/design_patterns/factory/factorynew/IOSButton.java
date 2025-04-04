package com.sept2024.LLD.design_patterns.factory.factorynew;

public class IOSButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("IOSButton::changeSize");
    }
}
