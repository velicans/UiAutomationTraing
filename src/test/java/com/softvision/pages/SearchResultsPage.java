package com.softvision.pages;

import com.softvision.utils.UIUtils;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage extends PageObject {

    UIUtils uiUtils;

    public void validateSearchResultsPageContainer() {

        assertTrue(getDriver().findElement(By.cssSelector(".chakra-container.css-nbgign")).isDisplayed());
    }

    public void scrollToElement(){
        WebElement element = getDriver().findElement(By.cssSelector(".infinite-scroll-component div:nth-child(39)"));
        uiUtils.scrollToElement(element);
    }
}
