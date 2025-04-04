package com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown;

public class AndroidDropDown implements DropDown{
    @Override
    public void createDropDown() {
        System.out.println("Creating Android dropdown");
    }

    @Override
    public void addDropDown() {
        System.out.println("Adding Android dropdown");
    }
}
