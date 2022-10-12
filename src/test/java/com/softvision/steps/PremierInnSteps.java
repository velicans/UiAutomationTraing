package com.softvision.steps;

import com.softvision.pages.HomePage;
import com.softvision.pages.LoginPage;
import com.softvision.pages.SearchResultsPage;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class PremierInnSteps {

    LoginPage loginPage;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    HotelDetailsPage hotelDetailsPage;
    AncillariesPage ancillariesPage;

    HotelCard hotelCard;

    @Step
    public void login(String user, String password) {

        loginPage.fillUsername(user);
        loginPage.fillPassword(password);
        loginPage.clickSubmit();
    }

    @Step
    public void validateCurrentUrl(String expectedUrl) {

        String currentUrl = loginPage.getCurrentUrl();
        assertEquals(expectedUrl ,currentUrl, "Expected url is not matching the current url.");
    }

    @Step
    public void editSearchBar() {

        homePage.editSearchBar();


    }

    @Step
    public void clickSearch() {

        homePage.clickSearch();
    }

    @Step
    public void validateSearchResultsPage() {

        searchResultsPage.validateSearchResultsPageContainer();
        log.info("Pagina incarcata");
    }
}
