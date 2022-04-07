package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AddToCartSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartFeatureSteps {

    @Steps
    AddToCartSteps cartUser;

    @Given("user is at the DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        cartUser.navigateToHomePage();
    }


}