package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import io.netty.util.internal.StringUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.assertj.core.api.CollectionAssert;
import org.hamcrest.core.AnyOf;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static io.netty.util.internal.StringUtil.*;
import static org.assertj.core.api.CollectionAssert.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

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
        List phones = new ArrayList();
        String[] phoneList = {"Samsung galaxy s6", "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9"};
        Collections.addAll(phones, phoneList);
        String[] phoneArray = homePage.getPhonesTitle();
        for (int i = 0; i <phoneArray.length; i++) {
            System.out.println("the " + (i+1) + "th Phone is " + phoneArray[i]);
            assertTrue(phones.contains(phoneArray[i]));
        }
    }

    public void verifyOnlyLaptopsShow() {
        List laptops = new ArrayList();
        String[] laptopList = {"Sony vaio i5", "Sony vaio i7", "MacBook air", "Dell i7 8gb", "2017 Dell 15.6 Inch", "MacBook Pro"};
        Collections.addAll(laptops, laptopList);
        String[] laptopArray =  homePage.getLaptopsTitle();
        for (int i=0;i<laptopArray.length; i++) {
            System.out.println("the " + i + "th Laptop is " + laptopArray[i]);
            assertTrue(laptops.contains(laptopArray[i]));
        }
    }

    public void verifyOnlyMonitorsShow() {
        List monitors = new ArrayList();
        String[] monitorList = {"ASUS Full HD", "Apple monitor 24"};
        Collections.addAll(monitors, monitorList);
        String[] monitorArray =  homePage.getMonitorsTitle();
        for (int i=0;i<monitorArray.length; i++) {
            System.out.println("the " + i + "th Laptop is " + monitorArray[i]);
            assertTrue(monitors.contains(monitorArray[i]));
        }
    }
}