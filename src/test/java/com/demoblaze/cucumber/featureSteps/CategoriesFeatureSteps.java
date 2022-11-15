package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.BaseSteps;
import com.demoblaze.cucumber.steps.CategoriesSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CategoriesFeatureSteps {

    @Steps
    CategoriesSteps categoriesUser;

    @Steps
    BaseSteps baseUser;

    @Given("user is on the DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        baseUser.navigateToHomePage();
    }

    @When("user clicks on Categories Title")
    public void userClicksOnCategoriesTitle() {
        categoriesUser.clickCategoryTitle();
    }

    @Then("the home page should refresh")
    public void theHomePageShouldRefresh() {
        categoriesUser.verifyCategoryTitle();
        categoriesUser.verifyPhonesTitle();
        categoriesUser.verifyLaptopsTitle();
        categoriesUser.verifyMonitorsTitle();
    }

    @When("user click on Phone Category")
    public void userClickOnPhoneCategory() {
        categoriesUser.clickPhoneCategory();
    }

    @Then("only Phones should show")
    public void onlyPhonesShouldShow() {
        categoriesUser.verifyOnlyPhonesShow();
    }

    @When("user click on Laptop Category")
    public void userClickOnLaptopCategory() {
        categoriesUser.clickLaptopCategory();
    }

    @Then("only Laptops should show")
    public void onlyLaptopsShouldShow() {
        categoriesUser.verifyOnlyLaptopsShow();
    }

    @When("user click on Monitor Category")
    public void userClickOnMonitorCategory() {
        categoriesUser.clickMonitorCategory();
    }

    @Then("only Monitors should show")
    public void onlyMonitorsShouldShow() {
        categoriesUser.verifyOnlyMonitorsShow();
    }
}
