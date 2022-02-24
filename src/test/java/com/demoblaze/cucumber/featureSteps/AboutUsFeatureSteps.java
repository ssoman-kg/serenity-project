package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AboutUsSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AboutUsFeatureSteps {

    @Steps
    AboutUsSteps aboutUsUser;

    @Managed
    WebDriver driver;

    @Given("user is at the DemoBlaze landing page")
    public void userIsAtTheDemoBlazeLandingPage() {
        aboutUsUser.navigateToHomePage();
        }

    @When("user clicks on About us link")
    public void userClicksOnAboutUsLink() {
        aboutUsUser.navigateToAboutUs();
    }

    @Then("About us modal should open")
    public void AboutUsModalShouldOpen() {
        String aboutUsTitle = aboutUsUser.findTitle();
        assertEquals("About us", aboutUsTitle);
    }

    @When("user clicks on Play button on the modal")
    public void userClicksOnPlayButton() {
        aboutUsUser.clickPlayButton();
    }

    @Then("the video should start playing")
    public void videoShouldPlay() throws IOException {
        aboutUsUser.showPauseButton();
        aboutUsUser.videoIsPlaying();
        Object t = aboutUsUser.videoElement().getAttribute("currentTime");
        Assert.assertNotEquals(0, t);
    }

    @When("user clicks on Pause button on the video")
    public void userClicksOnPauseButton() {
        aboutUsUser.clickPauseButton();
    }

    @Then("the video should stop playing")
    public void videoShouldStop() {
        aboutUsUser.showPlayButton();
    }
    }
}
