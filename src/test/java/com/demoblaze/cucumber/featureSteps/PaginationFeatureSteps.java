package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.PaginationSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class PaginationFeatureSteps {

    @Steps
    PaginationSteps paginationUser;

    @Given("user is at DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        paginationUser.navigateToHomePage();
    }

    @When("user clicks on Next button")
    public void userClicksOnNextButton() {

    }

    @Then("the Next page should show")
    public void theNextPageShouldShow() {

    }

    @When("user clicks on Previous button")
    public void userClicksOnPreviousButton() {

    }

    @Then("the Previous page should show")
    public void thePreviousPageShouldShow() {
    }
}
