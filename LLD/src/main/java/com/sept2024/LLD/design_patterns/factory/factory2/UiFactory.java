package com.sept2024.LLD.design_patterns.factory.factory2;

import com.sept2024.LLD.design_patterns.factory.factory2.component.button.Button;
import com.sept2024.LLD.design_patterns.factory.factory2.component.dropdown.DropDown;

/*
    This interface contains factory methods.
 */
public interface UiFactory {
    Button createButton();
    DropDown createDropdown();
}
