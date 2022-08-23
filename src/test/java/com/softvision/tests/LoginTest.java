package com.softvision.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    @Test
    public void test(){

        driver.get("https://premier-inn.dev.opera.whitbread.digital/en");

        driver.findElement(By.cssSelector(".panel-left-border #signInFormUsername")).sendKeys("");
        driver.findElement(By.cssSelector(".panel-left-border #signInFormPassword")).sendKeys("");
        driver.findElement(By.cssSelector(".panel-left-border [name=\"signInSubmitButton\"]")).click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl == "https://premier-inn.dev.opera.whitbread.digital/en");

    }
}