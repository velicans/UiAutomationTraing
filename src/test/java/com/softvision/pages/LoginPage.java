package com.softvision.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public void fillUsername(String user) {

        getDriver().findElement(By.cssSelector(".panel-left-border #signInFormUsername")).sendKeys(user);
    }

    public void fillPassword(String password) {

        getDriver().findElement(By.cssSelector(".panel-left-border #signInFormPassword")).sendKeys("qR$N?*vE5ps3+s@v3!*3=9PTn#xxk=");
    }

    public void clickSubmit() {

        getDriver().findElement(By.cssSelector(".panel-left-border [name=\"signInSubmitButton\"]")).click();
    }

    public String getCurrentUrl() {

        return getDriver().getCurrentUrl();
    }
}
