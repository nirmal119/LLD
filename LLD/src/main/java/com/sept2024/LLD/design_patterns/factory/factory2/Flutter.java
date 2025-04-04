package com.sept2024.LLD.design_patterns.factory.factory2;

import java.util.Objects;

public class Flutter {

    /*
        refreshUI and setTheme are platform independent
        that's why flutter is a class and not an interface
     */
    void refreshUI() {
        System.out.println("Refreshing the UI");
    }

    void setTheme() {
        System.out.println("Setting the theme");
    }

    public UiFactory getFactory(SupportedPlatforms platform) {
        if(platform.equals(SupportedPlatforms.ANDROID)) {
            return new AndroidUiFactory();
        }else if (platform.equals(SupportedPlatforms.IOS)) {
            return new IosUiFactory();
        }
        return null;
    }
}
