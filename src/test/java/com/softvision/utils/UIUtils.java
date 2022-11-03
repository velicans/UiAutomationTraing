package com.softvision.utils;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UIUtils extends PageObject {
    public void scrollToElement (WebElement element){
        evaluateJavascript("arguments[0].scrollIntoView();",element);
    }

    public void checkFacility(WebElement element) {
        assertEquals(true, element.isDisplayed());
    }
}
