package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

import java.nio.file.FileStore;

public class AboutUsSteps extends ScenarioSteps {

    AboutUsSteps aboutPage;
    HomePage homePage;

    public void navigateToHomePage()  { homePage.navigateToHomePage();}

    public void navigateToAboutUs() { homePage.navigateToAboutUs();
    }

    public void clickPauseButton() {
    }

    public void clickPlayButton() {
    }

    public String findTitle() { return aboutPage.findTitle();}


    public void showPauseButton() {
    }

    public void showPlayButton() {
    }

    public void videoIsPlaying() {
    }

    public FileStore videoElement() {
    }
}

