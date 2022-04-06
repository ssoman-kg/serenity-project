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

       // for (int j = 0; j < 1; j++) {
            List myList = new ArrayList();
            String[] Phones = {"Samsung galaxy s6", "Nokia lumia 1520", "Nexus 6", "Samsung galaxy s7", "Iphone 6 32gb", "Sony xperia z5", "HTC One M9"};
            Collections.addAll(myList, Phones);
            System.out.println(homePage.getProductTitle());
            Assert.assertTrue(myList.contains(homePage.getProductTitle()));
       // }
    }

    public void verifyOnlyLaptopsShow() {
       // for(int i=0;i<6;i++){
          //  homePage.getProductTitle();
        }
    //}

    public void verifyOnlyMonitorsShow() {
       // for(int i=0;i<2;i++){
          //  homePage.getProductTitle();
        }
  //  }
}