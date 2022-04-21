package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.BasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BaseSteps extends ScenarioSteps {

    BasePage basePage;

    /***********************************
     * BASE STEPS
     /***********************************
     */

    @Step("Navigate to DemoBlaze home page")
    public void navigateToHomePage() {
        basePage.navigateToDemoBlaze();
    }
}
