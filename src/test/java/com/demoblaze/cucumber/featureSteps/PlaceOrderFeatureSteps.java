package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.PlaceOrderSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PlaceOrderFeatureSteps {

    @Steps
    PlaceOrderSteps placeOrderUser;

    @Given("user is at the DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        placeOrderUser.navigateToHomePage();
    }

    @When("user clicks on About us link")
    public void userClicksOnAboutUsLink() {
        placeOrderUser.navigateToAboutUs();
    }

    @Then("About us modal should open")
    public void aboutUsModalShouldOpen() {

    }
}