package com.softvision.steps;

import com.softvision.pages.*;
import com.softvision.pages.HotelDetailsPage;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class PremierInnSteps {

    LoginPage loginPage;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    HotelDetailsPage hotelDetailsPage;
    AncillariesPage ancillariesPage;

    @Step
    public void login(String user, String password) {

        loginPage.fillUsername(user);
        loginPage.fillPassword(password);
        loginPage.clickSubmit();
    }

    @Step
    public void validateCurrentUrl(String expectedUrl) {

        String currentUrl = loginPage.getCurrentUrl();
        assertEquals(expectedUrl ,currentUrl);
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

    @Step
    public void selectHotel() {

        searchResultsPage.selectHotel();

    }

    @Step
    public void validateHotelDetailsPage() {

        hotelDetailsPage.validateHotelDetailsPageContainer();
        log.info("Pagina incarcata");

    }

    @Step
    public void seeHotelFacilities() {
        hotelDetailsPage.seeHotelFacilities();

    }

    @Step
    public void seeOurRooms() {

        hotelDetailsPage.seeOurRooms();
    }

    @Step
    public void clickBookNow() {

        hotelDetailsPage.clickBookNow();
    }

    @Step
    public void validateAncillariesPage() {

        ancillariesPage.validateHotelDetailsPageContainer();
        log.info("Pagina incarcata");
    }

    @Step
    public void scrollToBottom() {

        hotelDetailsPage.scrollToBottom();
    }
}
