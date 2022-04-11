package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.PaginationSteps;
import com.demoblaze.pages.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PaginationFeatureSteps {

    @Steps
    PaginationSteps paginationUser;
    BasePage baseUser;

    @Given("user is at DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        baseUser.navigateToDemoBlaze();    }

    @When("user clicks on Previous button")
    public void userClicksOnPreviousButton() {
        paginationUser.clickOnPreviousButton();
    }

    @Then("the Previous page should show")
    public void thePreviousPageShouldShow() {
        paginationUser.verifyPreviousNextButtonShow();
        paginationUser.verifyFirstProductOnPreviousPage();
        paginationUser.verifyLastProductOnPreviousPage();
    }

    @When("user clicks on Next button")
    public void userClicksOnNextButton() {
        paginationUser.clickOnNextButton();
    }

    @Then("the Next page should show")
    public void theNextPageShouldShow() {
        paginationUser.verifyOnlyPreviousButtonShow();
        paginationUser.verifyLastProductOnNextPage();
        paginationUser.verifyFirstProductOnNextPage();
    }
}
