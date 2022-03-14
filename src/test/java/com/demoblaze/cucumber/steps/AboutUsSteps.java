package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class AboutUsSteps extends ScenarioSteps {

    AboutPage aboutPage;
    HomePage homePage;

    /***********************************
     *
     * ABOUT US STEPS
     /***********************************
     */

    public void navigateToHomePage()  { homePage.navigateToHomePage();}

    public void navigateToAboutUs() { homePage.navigateToAboutUs();}

    public void clickPlayButtonModal() { aboutPage.playVideoModal(); }

    public void clickPauseButton() { aboutPage.pauseVideo(); }

    public void verifyModalTitle() { aboutPage.verifyAboutUsTitle(); }

    public void verifyPauseButton() { aboutPage.verifyPauseIsShown(); }

    public void verifyVideoStops() { aboutPage.verifyIfVideoStop(); }
}


