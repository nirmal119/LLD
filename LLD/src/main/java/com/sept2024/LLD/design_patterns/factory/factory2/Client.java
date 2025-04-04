package com.sept2024.LLD.design_patterns.factory.factory2;

import com.sept2024.LLD.design_patterns.factory.factory2.component.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        UiFactory uiFactory = flutter.getFactory(SupportedPlatforms.ANDROID);
        Button button = uiFactory.createButton();
        button.createButton();
    }
}
