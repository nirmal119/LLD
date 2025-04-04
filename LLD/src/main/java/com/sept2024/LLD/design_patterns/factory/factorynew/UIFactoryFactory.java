package com.sept2024.LLD.design_patterns.factory.factorynew;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatform(SupportedPlatForm platform) {
        return switch (platform) {
            case IOS -> new IOSUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
