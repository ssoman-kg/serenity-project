package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class SliderSteps extends ScenarioSteps {

    HomePage homePage;

    /***********************************
     * IMAGE SLIDER STEPS
     /***********************************
     */

    @Step("Click on Previous slide button")
    public void clickPreviousButton() {
        homePage.clickPreviousSlideButton();
    }

    @Step("Click on Next slide button")
    public void clickNextButton() {
        homePage.clickNextSlideButton();
    }
    
    @Step("Verify the alt text of First slide")
    public void verifyFirstSlide() {
        assertEquals("First slide", homePage.getAltText(HomePage.FIRST_SLIDE));
    }

    @Step("Verify the alt text of Second slide")
    public void verifySecondSlide() {
        assertEquals("Second slide", homePage.getAltText(HomePage.SECOND_SLIDE));
    }

    @Step("Verify the alt text of Third slide")
    public void verifyThirdSlide() {
        assertEquals("Third slide", homePage.getAltText(HomePage.THIRD_SLIDE));
    }
}

