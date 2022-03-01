package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class PaginationSteps extends ScenarioSteps {

    AboutPage aboutPage;
    HomePage homePage;

    /***********************************
     *
     * PAGINATION STEPS
     /***********************************
     */

    public void navigateToHomePage()  { homePage.navigateToHomePage();}


}


