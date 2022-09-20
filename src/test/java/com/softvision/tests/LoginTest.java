package com.softvision.tests;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
@Slf4j
@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    @Test
    public void test(){

        driver.get("https://premier-inn.dev.opera.whitbread.digital/en");

        //Login
        driver.findElement(By.cssSelector(".panel-left-border #signInFormUsername")).sendKeys("automation_user");
        driver.findElement(By.cssSelector(".panel-left-border #signInFormPassword")).sendKeys("qR$N?*vE5ps3+s@v3!*3=9PTn#xxk=");
        driver.findElement(By.cssSelector(".panel-left-border [name=\"signInSubmitButton\"]")).click();

        String currentUrl = driver.getCurrentUrl();
        //assertTrue(currentUrl == "https://premier-inn.dev.opera.whitbread.digital/en");
        //assertTrue(currentUrl.equals("https://premier-inn.dev.opera.whitbread.digital/en"));
        assertEquals("https://premier-inn.dev.opera.whitbread.digital/en",currentUrl);

        //Edit search bar
        driver.findElement(By.cssSelector("[data-testid=locationPicker-locationPlaceholder]")).click();
       // driver.findElement(By.id(""));
        driver.findElement(By.cssSelector("[data-testid=locationPicker-locationPlaceholder]")).sendKeys("LON");
        driver.findElement(By.cssSelector("[data-testid=\"locationPicker-autocompleteList\"] :first-child")).click();
        driver.findElement(By.cssSelector(".react-datepicker__input-container")).click();
        driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        driver.findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous")).click();
        driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--016")).click();
        driver.findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--020")).click();

        //Press Search button
        driver.findElement(By.cssSelector("[name=search-button]")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            log.error("Sleep failed.");
        }

        //Next page
       // driver.findElement(By.cssSelector(".chakra-container.css-nbgign")).click();

        assertTrue(driver.findElement(By.cssSelector(".chakra-container.css-nbgign")).isDisplayed());
        log.info("Pagina incarcata");
        // currentUrl = driver.getCurrentUrl();
        // assertTrue(currentUrl.equals("https://premier-inn.dev.opera.whitbread.digital/search.html?searchModel.searchTerm=London,%20UK&PLACEID=ChIJdd4hrwug2EcRmSrV3Vo6llI&ARRdd=16&ARRmm=11&ARRyyyy=2022&NIGHTS=4&ROOMS=1&ADULT1=1&CHILD1=0&COT1=0&INTTYP1=DB&BOOKINGCHANNEL=WEB&&SORT=1"));


    }
}