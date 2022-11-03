package com.softvision.tests;

import com.softvision.steps.PremierInnSteps;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.openhtmltopdf.util.Util.sleep;

@Slf4j
@RunWith(SerenityRunner.class)
public class HotelFacilitiesInHDPTest {

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
        premierInn.editSearchBar("Manchester Old");

        //Press Search button
        premierInn.clickSearch();

       // sleep(3000);

        //SRP
        premierInn.validateSearchResultsPage();
        premierInn.selectHotel();

        //HDP
        premierInn.validateHotelDetailsPage();

        sleep(1000);

        //Open See all Hotel Facilities
        premierInn.seeHotelFacilities();

//        premierInn.scrollToOurRooms();
//
//        //See our rooms
//        premierInn.seeOurRooms();




    }


}
