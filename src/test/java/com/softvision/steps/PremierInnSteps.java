package com.softvision.steps;

import com.softvision.pages.HomePage;
import com.softvision.pages.HotelCard;
import com.softvision.pages.LoginPage;
import com.softvision.pages.SearchResultsPage;
import lombok.extern.slf4j.Slf4j;
import net.thucydides.core.annotations.Step;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Slf4j
public class PremierInnSteps {

    LoginPage loginPage;
    HomePage homePage;
    SearchResultsPage searchResultsPage;

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
        assertEquals("Expected url is not matching the current url." ,expectedUrl,currentUrl);
        //assertEquals(expectedUrl ,currentUrl, "Expected url is not matching the current url.");
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
    public void scrollToElement(){
        searchResultsPage.scrollToElement();
    }

    @Step
    public void checkParkingFacility(String cardName) {
        hotelCard.checkParkingFacility(cardName);
    }

    @Step
    public void checkRestaurantFacility(String cardName) {
        hotelCard.checkRestaurantFacility(cardName);
    }

    @Step
    public void checkAirConFacility(String cardName) {
        hotelCard.checkAirConFacility(cardName);
    }
}
