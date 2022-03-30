package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AboutUsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AboutUsFeatureSteps {

    @Steps
    AboutUsSteps aboutUsUser;

    @Given("user is at DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        aboutUsUser.navigateToHomePage();
    }

    @When("user clicks on About us link")
    public void userClicksOnAboutUsLink() {
        aboutUsUser.navigateToAboutUs();
    }

    @Then("About us modal should open")
    public void aboutUsModalShouldOpen() {
        aboutUsUser.verifyModalTitle(); }

    @When("user clicks on Play button on the modal")
    public void userClicksOnPlayButton() {
        aboutUsUser.clickPlayButtonModal();
    }

    @Then("the video should start playing")
    public void videoShouldPlay() {
        aboutUsUser.verifyPauseButton(); }

    @When("user clicks on Pause button on the video")
    public void userClicksOnPauseButton() {
        aboutUsUser.clickPauseButton();
    }

    @Then("the video should stop playing")
    public void videoShouldStop() {
        aboutUsUser.verifyVideoStops();
    }
}