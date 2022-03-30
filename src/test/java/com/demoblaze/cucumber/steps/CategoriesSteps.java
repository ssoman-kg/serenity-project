package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static net.bytebuddy.matcher.ElementMatchers.anyOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CategoriesSteps extends ScenarioSteps {

    HomePage homePage;

    /***********************************
     *
     * CATEGORIES STEPS
     /***********************************
     */

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

    @Step("Verify the Category Heading Title")
    public void verifyCategoryTitle() {
        assertEquals("CATEGORIES",homePage.getCategoriesHeadingText());
    }

    @Step("Click on Categories Link")
    public void clickCategoryTitle() {
        homePage.clickCategories();
    }

    @Step("Verify the Phone Category Title")
    public void verifyPhonesTitle() {
        assertEquals("Phones",homePage.getCategoriesPhonesText());
    }

    @Step("Verify Home page refreshes")
    public void verifyHomePageOpen() {
        assertEquals("https://www.demoblaze.com", homePage.getUrl());
    }

    @Step("Click on Phone Category")
    public void clickPhoneCategory() {
        homePage.clickPhoneCategory();
    }

    @Step("Verify the Laptop Category Title")
    public void verifyLaptopsTitle() {
        assertEquals("Laptops",homePage.getCategoriesLaptopsText());
    }

    @Step("Click on Laptop Category")
    public void clickLaptopCategory() {
        homePage.clickLaptopCategory();
    }

    @Step("Verify the Monitor Category Title")
    public void verifyMonitorsTitle() {
        assertEquals("Monitors",homePage.getCategoriesMonitorsText());
    }

    @Step("Click on Monitor Category")
    public void clickMonitorCategory() {
        homePage.clickMonitorCategory();
    }

    public void verifyOnlyPhonesShow() {
     for(int i=0;i<7;i++) {
//         assertEquals(anyOf("Samsung galaxy s6", "Nokia lumia 1520",
//                 "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9"), homePage.getProductTitle(i));
         System.out.println(homePage.getProductTitle(i));

        // assertEquals("Samsung galaxy s6", homePage.getProductTitle(i));
//         Ensure.that(homePage.getProductTitle(i).contains("Samsung galaxy s6", "Nokia lumia 1520",
//                 "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9"));

     }
    }

    public void verifyOnlyLaptopsShow() {
        for(int i=0;i<6;i++){
            homePage.getProductTitle(i);
        }
    }

    public void verifyOnlyMonitorsShow() {
        for(int i=0;i<2;i++){
            homePage.getProductTitle(i);
        }
    }
}