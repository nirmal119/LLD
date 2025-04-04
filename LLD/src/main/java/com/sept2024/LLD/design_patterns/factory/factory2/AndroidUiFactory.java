package com.sept2024.LLD.design_patterns.factory.factory2;

import com.sept2024.LLD.design_patterns.factory.factory2.component.button.AndroidButton;
import com.sept2024.LLD.design_patterns.factory.factory2.component.button.Button;
import com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown.AndroidDropDown;
import com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown.DropDown;
import com.sept2024.LLD.design_patterns.factory.factorynew.*;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropdown() {
        return new AndroidDropDown();
    }
}
