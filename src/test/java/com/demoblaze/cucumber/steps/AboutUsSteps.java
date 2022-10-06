package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class AboutUsSteps extends ScenarioSteps {

    AboutPage aboutPage;
    HomePage homePage;

    /***********************************
     * ABOUT US STEPS
     /***********************************
     */

    @Step("Navigate to About us page")
    public void navigateToAboutUs() {
        homePage.navigateToAboutUs();
    }

    @Step("Click on Play button on the modal")
    public void clickPlayButtonModal() {
        aboutPage.playVideoModal();
    }

    @Step("Click Pause button")
    public void clickPauseButton() {
        aboutPage.pauseVideo();
    }

    @Step("Verify the modal title")
    public void verifyModalTitle() {
        assertEquals("About us", aboutPage.getAboutModalTitle());
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

    @Step("Hover over video")
    public void hoverVideo() {
        aboutPage.moveToVideo();
    }

    @Step("Verify if video plays")
    public void verifyVideoPlays() {
        assertNotEquals("0", aboutPage.findCurrentTime());
        System.out.println(aboutPage.findCurrentTime());

    }

}
