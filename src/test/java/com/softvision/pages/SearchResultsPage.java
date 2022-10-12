package com.softvision.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage extends PageObject {

    public void validateSearchResultsPageContainer() {

        assertTrue(getDriver().findElement(By.cssSelector(".chakra-container.css-nbgign")).isDisplayed());
    }

    public void selectHotel() {

        getDriver().findElement(By.cssSelector("[data-testid=SRP-hotel-button]")).click();
    }
}
