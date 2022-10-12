package com.softvision.pages;

import com.softvision.utils.UIUtils;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class HotelCard extends SearchResultsPage{
    UIUtils uiUtils;

    public WebElementFacade findCard(String cardName) {
        return find("//div[@data-testid='SRP-hotel-card'][.//p[text()='"+cardName+"']]");

    }


    public void checkParkingFacility(String cardName) {
        WebElementFacade element = findCard(cardName).find(By.cssSelector(".infinite-scroll-component div:nth-child(39)"));
        element.shouldBeCurrentlyVisible();    }

    public void checkRestaurantFacility(String cardName) {
        WebElementFacade element = findCard(cardName).find(By.cssSelector(".infinite-scroll-component div:nth-child(39)"));
        element.shouldBeCurrentlyVisible();
    }

    public void checkAirConFacility(String cardName) {
        WebElementFacade element = findCard(cardName).find(By.cssSelector(".infinite-scroll-component div:nth-child(39)"));
        element.shouldBeCurrentlyVisible();
        //uiUtils.checkFacility(element);
    }
}
