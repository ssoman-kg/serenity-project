package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CategoriesSteps extends ScenarioSteps {

    HomePage homePage;

    /***********************************
     * CATEGORIES STEPS
     /***********************************
     */

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

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

    public void verifyOnlyPhonesShow() {
        List phoneList = new ArrayList();
        String[] phones = {"Samsung galaxy s6", "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9"};
        Collections.addAll(phoneList, phones);
        String[] phoneArray = homePage.getPhonesTitle();
        for (String s : phoneArray) {
            assertTrue(phoneList.contains(s));
        }
    }

    public void verifyOnlyLaptopsShow() {
        List laptopList = new ArrayList();
        String[] laptops = {"Sony vaio i5", "Sony vaio i7", "MacBook air", "Dell i7 8gb", "2017 Dell 15.6 Inch", "MacBook Pro"};
        Collections.addAll(laptopList, laptops);
        String[] laptopArray =  homePage.getLaptopsTitle();
        for (String s : laptopArray) {
            assertTrue(laptopList.contains(s));
        }
    }

    public void verifyOnlyMonitorsShow() {
        List monitorList = new ArrayList();
        String[] monitors = {"ASUS Full HD", "Apple monitor 24"};
        Collections.addAll(monitorList, monitors);
        String[] monitorArray =  homePage.getMonitorsTitle();
        for (String s : monitorArray) {
            assertTrue(monitorList.contains(s));
        }
    }
}