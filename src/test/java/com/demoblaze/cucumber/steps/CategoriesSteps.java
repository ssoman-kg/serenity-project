package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CategoriesSteps extends ScenarioSteps {

    HomePage homePage;

    /***********************************
     * CATEGORIES STEPS
     /***********************************
     */

    @Step("Verify the Category Heading Title")
    public void verifyCategoryTitle() {
        assertEquals("CATEGORIES", homePage.getCategoriesHeadingText());
    }

    @Step("Click on Categories Link")
    public void clickCategoryTitle() {
        homePage.clickCategories();
    }

    @Step("Verify the Phone Category Title")
    public void verifyPhonesTitle() {
        assertEquals("Phones", homePage.getCategoriesPhonesText());
    }

    @Step("Click on Phone Category")
    public void clickPhoneCategory() {
        homePage.clickPhoneCategory();
    }

    @Step("Verify the Laptop Category Title")
    public void verifyLaptopsTitle() {
        assertEquals("Laptops", homePage.getCategoriesLaptopsText());
    }

    @Step("Click on Laptop Category")
    public void clickLaptopCategory() {
        homePage.clickLaptopCategory();
    }

    @Step("Verify the Monitor Category Title")
    public void verifyMonitorsTitle() {
        assertEquals("Monitors", homePage.getCategoriesMonitorsText());
    }

    @Step("Click on Monitor Category")
    public void clickMonitorCategory() {
        homePage.clickMonitorCategory();
    }

    @Step("Verify right products are showing")
    public void verifyRightProductShow(List<String> Names) {
        for (WebElement webElement : homePage.getProductTitle()) {
            assertTrue(Names.contains(webElement.getText()));
        }
    }

    @Step("Verify right Phone products are showing")
    public void verifyOnlyPhonesShow() {
        List<String> phoneNames = Arrays.asList("Samsung galaxy s6", "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9");
        verifyRightProductShow(phoneNames);
    }

    @Step("Verify right Laptop products are showing")
    public void verifyOnlyLaptopsShow() {
        List<String> laptopNames = Arrays.asList("Sony vaio i5", "Sony vaio i7", "MacBook air", "Dell i7 8gb", "2017 Dell 15.6 Inch", "MacBook Pro");
        verifyRightProductShow(laptopNames);
    }

    @Step("Verify right Monitor products are showing")
    public void verifyOnlyMonitorsShow() {
        List<String> monitorNames = Arrays.asList("ASUS Full HD", "Apple monitor 24");
        verifyRightProductShow(monitorNames);
    }
}
