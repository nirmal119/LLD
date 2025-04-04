package com.sept2024.LLD.design_patterns.factory.factory2.component.button;

public class IosButton implements Button{
    @Override
    public void createButton() {
        System.out.println("Showing IOS button");
    }

    @Override
    public void addBorder() {
        System.out.println("Adding border to IOS button");
    }
}
