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

    @When("user clicks on About us link")
    public void userClicksOnAboutUsLink() {
        paginationUser.navigateToAboutUs();
    }

    @Then("About us modal should open")
    public void AboutUsModalShouldOpen() {
        String aboutUsTitle = paginationUser.findTitle();
        assertEquals("About us", aboutUsTitle);
    }

    @When("user clicks on Play button on the modal")
    public void userClicksOnPlayButton() {
        paginationUser.clickPlayButtonModal();
    }

    @Then("the video should start playing")
    public void videoShouldPlay() {
        String pause = paginationUser.showPauseButton();
        Assert.assertEquals("Pause", pause);
    }

    @When("user clicks on Pause button on the video")
    public void userClicksOnPauseButton() {
        paginationUser.clickPauseButton();
    }

    @Then("the video should stop playing")
    public void videoShouldStop() {
        String play = paginationUser.showPlayButton();
        Assert.assertEquals("Play", play);
        paginationUser.clickPlayButton();
        String pause = paginationUser.showPauseButton();
        Assert.assertEquals("Pause", pause);
    }
}
