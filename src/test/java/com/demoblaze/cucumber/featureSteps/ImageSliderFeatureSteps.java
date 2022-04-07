package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AboutUsSteps;
import com.demoblaze.cucumber.steps.SliderSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ImageSliderFeatureSteps {

    @Steps
    SliderSteps slideUser;

    @Given("user is on the DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        slideUser.navigateToHomePage();
    }

    @When("user clicks on next slide button")
    public void userClicksOnNextSliderButton() {
        slideUser.clickNextButton();
    }

    @Then("second slide should show")
    public void secondSlideShouldShow() {
        slideUser.verifySecondSlide();
    }

    @When("user clicks on next slide button again")
    public void userClicksOnNextSliderButtonAgain() {
        slideUser.clickNextButton();
    }

    @Then("third slide should show")
    public void thirdSlideShouldShow() {
        slideUser.verifyThirdSlide();
    }

    @When("user clicks on previous slide button")
    public void userClicksOnPreviousSliderButton() {
        slideUser.clickPreviousButton();
    }

    @Then("first slide should show")
    public void firstSlideShouldShow() {
        slideUser.verifyFirstSlide();
    }

    @When("user clicks on previous slide button again")
    public void userClicksOnPreviousSliderButtonAgain() {
        slideUser.clickPreviousButton();
    }

    @Then("third slide should show again")
    public void thirdSlideShouldShowAgain() {
        slideUser.verifyThirdSlide();
    }
}