package com.sept2024.LLD.design_patterns.factory.factorynew;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("AndroidButton::changeSize");
    }
}
