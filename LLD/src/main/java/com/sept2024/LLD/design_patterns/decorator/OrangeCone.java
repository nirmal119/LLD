package com.sept2024.LLD.design_patterns.decorator;

public class OrangeCone implements IceCream{
    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Orange cone";
    }
}
