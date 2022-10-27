package com.softvision.pages;

import com.softvision.utils.UIUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class SearchResultsPage extends PageObject {

    UIUtils uiUtils;

    public void validateSearchResultsPageContainer() {

        WebElementFacade element = find(By.cssSelector(".chakra-container.css-nbgign"));
        element.withTimeoutOf(Duration.ofSeconds(3)).waitUntilVisible();

    }

    public void scrollToElement(){
        WebElement element = getDriver().findElement(By.cssSelector(".infinite-scroll-component div:nth-child(39)"));
        uiUtils.scrollToElement(element);
    }

    public void selectHotel() {
        getDriver().findElement(By.cssSelector("[data-testid=SRP-hotel-card]")).click();
    }
}
