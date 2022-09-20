package com.softvision.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {


    public void editSearchBar() {

        getDriver().findElement(By.cssSelector("[data-testid=locationPicker-locationPlaceholder]")).click();
        getDriver().findElement(By.cssSelector("[data-testid=locationPicker-locationPlaceholder]")).sendKeys("LON");
        getDriver().findElement(By.cssSelector("[data-testid=\"locationPicker-autocompleteList\"] :first-child")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__input-container")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--next")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__navigation.react-datepicker__navigation--previous")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--016")).click();
        getDriver().findElement(By.cssSelector(".react-datepicker__day.react-datepicker__day--020")).click();
    }

    public void clickSearch() {

        getDriver().findElement(By.cssSelector("[name=search-button]")).click();
    }
}
