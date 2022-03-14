package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AboutUsSteps extends ScenarioSteps {

    AboutPage aboutPage;
    HomePage homePage;

    /***********************************
     *
     * ABOUT US STEPS
     /***********************************
     */

    @Step("Navigate to Home page")
    public void navigateToHomePage()  { homePage.navigateToHomePage();}

    @Step("Navigate to About us page")
    public void navigateToAboutUs() { homePage.navigateToAboutUs();}

    @Step("Click on Play button on the modal")
    public void clickPlayButtonModal() { aboutPage.playVideoModal(); }

    @Step("Click Pause button")
    public void clickPauseButton() { aboutPage.pauseVideo(); }

    @Step("Verify the modal title")
    public void verifyModalTitle() { aboutPage.verifyAboutUsTitle(); }

    @Step("Check if Pause button is shown")
    public void verifyPauseButton() { aboutPage.verifyPauseIsShown(); }

    @Step("Verify if video stops")
    public void verifyVideoStops() { aboutPage.verifyIfVideoStop(); }
}