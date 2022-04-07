package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PaginationSteps extends ScenarioSteps {

    HomePage homePage;

    /***********************************
     * PAGINATION STEPS
     /***********************************
     */

    public void navigateToHomePage()  {
        homePage.navigateToHomePage();
    }

    public void clickOnNextButton() {
        homePage.clickNext();
    }

    public void clickOnPreviousButton() {
        homePage.clickPrevious();
    }

    public void verifyLastProductOnNextPage() {
        assertEquals("MacBook Pro", homePage.getLastProductText());
    }

    public void verifyLastProductOnPreviousPage() {
        assertEquals("Apple monitor 24", homePage.getLastProductText());
    }

    public void verifyFirstProductOnPreviousPage() {
        assertEquals("Nokia lumia 1520", homePage.getFirstProductText());
    }

    public void verifyFirstProductOnNextPage() {
        assertEquals("MacBook air", homePage.getFirstProductText());
    }

    public void verifyPreviousNextButtonShow() {
        assertTrue(homePage.verifyPreviousButtonDisplayed());
        assertEquals("Previous", homePage.getPreviousButtonText());
        assertTrue(homePage.verifyNextButtonDisplayed());
        assertEquals("Next", homePage.getNextButtonText());
    }

    public void verifyOnlyPreviousButtonShow() {
        assertEquals("Previous", homePage.getPreviousButtonText());
        assertFalse(homePage.verifyNextButtonDisplayed());
        assertTrue(homePage.verifyPreviousButtonDisplayed());
    }
}


