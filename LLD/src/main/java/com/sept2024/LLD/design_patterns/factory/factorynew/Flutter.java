package com.sept2024.LLD.design_patterns.factory.factorynew;

import java.util.Objects;

public class Flutter {

    public void setTheme() {
        System.out.println("Setting theme");
    }

    public void refresh() {
        System.out.println("Refreshing flutter");
    }

    public UIFactory getUIFactory(String platform) {
        if(Objects.equals(platform, "Android")) {
            return new AndroidUIFactory();
        } else if(Objects.equals(platform, "ios")) {
            return new IOSUIFactory();
        }
        return null;
    }
}
