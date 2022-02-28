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

    public String findTitle() { return aboutPage.findTitle();}

    public void clickPlayButtonModal() { aboutPage.playVideoModal(); }

    public void clickPlayButton() { aboutPage.playVideo();}

    public String showPauseButton() { return aboutPage.showPauseButton(); }

    public String showPlayButton() { return aboutPage.showPlayButton(); }

    public void clickPauseButton() { aboutPage.pauseVideo(); }

}


