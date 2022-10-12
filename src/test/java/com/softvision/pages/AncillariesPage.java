package com.softvision.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class AncillariesPage extends PageObject {


    public void validateHotelDetailsPageContainer() {

        assertTrue(getDriver().findElement(By.cssSelector("[data-testid=AncillariesPage-PageContent]")).isDisplayed());

    }
}
