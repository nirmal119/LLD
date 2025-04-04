package com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown;

public class IosDropDown implements DropDown{
    @Override
    public void createDropDown() {
        System.out.println("Creating IOS dropdown");
    }

    @Override
    public void addDropDown() {
        System.out.println("Adding IOS dropdown");
    }
}
