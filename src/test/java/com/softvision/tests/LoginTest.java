package com.softvision.tests;

import com.softvision.steps.PremierInnSteps;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@Slf4j
@RunWith(SerenityRunner.class)
public class LoginTest {

    @Managed
    WebDriver driver;

    @Steps
    PremierInnSteps premierInn;

    @Test
    public void test(){

        driver.get("https://premier-inn.dev.opera.whitbread.digital/en");
        driver.manage().window().maximize();


        //Login
        premierInn.login("automation_user", "qR$N?*vE5ps3+s@v3!*3=9PTn#xxk=");

        premierInn.validateCurrentUrl("https://premier-inn.dev.opera.whitbread.digital/en");

        //Edit search bar
        premierInn.editSearchBar();


        //Press Search button
        premierInn.clickSearch();

        sleep(5000);

        //Search page
        premierInn.validateSearchResultsPage();
        premierInn.selectHotel();

        sleep(3000);

        //HDP
        premierInn.validateHotelDetailsPage();


        //Open See all Hotel Facilities
        premierInn.seeHotelFacilities();

        sleep(5000);

        //Scroll to our rooms
        premierInn.scrollToBottom();

        //See our rooms
        premierInn.seeOurRooms();

        //Choose rate and book now
        premierInn.clickBookNow();

        //Ancillaries
        premierInn.validateAncillariesPage();


    }

    private void sleep(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            log.error("Sleep failed.");
        }
    }



}