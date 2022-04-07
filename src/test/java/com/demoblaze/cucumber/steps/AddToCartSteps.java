package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class AddToCartSteps extends ScenarioSteps {

    AboutPage aboutPage;
    HomePage homePage;

    /***********************************
     *
     * ADD TO CART STEPS
     /***********************************
     */

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

    @Step("Check if Pause button is shown")
    public void verifyPauseButton() {
        assertEquals("Pause", aboutPage.getPauseButtonText());
    }

    @Step("Verify if video stops")
    public void verifyVideoStops() {
        assertEquals("Play", aboutPage.getPlayButtonText());
        aboutPage.playVideo();
        assertEquals("Pause", aboutPage.getPauseButtonText());
    }
}