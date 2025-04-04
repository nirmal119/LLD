package com.sept2024.LLD.design_patterns.factory.factorynew;

public class Client {
    public static void main(String[] args) {
        Flutter f = new Flutter();
//        UIFactory uif = f.getUIFactory("ios");
        UIFactory uiFactory = UIFactoryFactory.getUIFactoryForPlatform(SupportedPlatForm.ANDROID);
        Button b = uiFactory.createButton();
        b.changeSize();
    }
}
