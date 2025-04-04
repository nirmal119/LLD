package com.sept2024.LLD.design_patterns.factory.factory2;

import com.sept2024.LLD.design_patterns.factory.factory2.component.button.Button;
import com.sept2024.LLD.design_patterns.factory.factory2.component.button.IosButton;
import com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown.DropDown;
import com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown.IosDropDown;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public DropDown createDropdown() {
        return new IosDropDown();
    }
}
