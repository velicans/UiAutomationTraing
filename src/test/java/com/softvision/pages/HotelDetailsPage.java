package com.softvision.pages;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLElement;
import com.softvision.utils.UIUtils;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;


public class HotelDetailsPage extends PageObject{

    UIUtils uiUtils;

    public void validateHotelDetailsPageContainer() {

        assertTrue(getDriver().findElement(By.cssSelector("[data-testid=hdp_hotelInformationTopSection]")).isDisplayed());

    }

    public void seeHotelFacilities() {
        getDriver().findElement(By.cssSelector(".chakra-link.css-1pj0622")).click();
        sleep(3000);
        getDriver().findElement(By.cssSelector("[data-testid=facilities-modal-ModalCloseButton]")).click(); // cum fac actiunea de scroll
    }

    public void seeOurRooms() {
        assertTrue(getDriver().findElement(By.cssSelector("[data-testid=roomConfiguration-TabPanels]")).isDisplayed());
        getDriver().findElement(By.cssSelector("[data-testid=Twin-TabButtonLabel]")).click();
        sleep(1000);
        getDriver().findElement(By.cssSelector("[data-testid=Family-TabButton]")).click();
        sleep(1000);
        getDriver().findElement(By.cssSelector("[data-testid=Accessible-TabButton]")).click();
        sleep(2000);
    }

    private void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void scrollToBottom() {
        WebElement element = getDriver().findElement(By.cssSelector("[data-testid=hdp_ourRooms-title]"));
        evaluateJavascript("arguments[0].scrollIntoView();",element);

    }

    public void clickBookNow() {
        assertTrue(getDriver().findElement(By.cssSelector(".css-7i831y")).isSelected());
        getDriver().findElement(By.cssSelector("[data-testid=hdp_basketBookNowButton]")).click();

    }

    public void scrollToElement() {
        WebElement element = getDriver().findElement(By.cssSelector("[data-testid=roomConfiguration-TabsComponent]"));
        uiUtils.scrollToElement(element);
    }
}

