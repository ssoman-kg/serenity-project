package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class LogInSteps extends ScenarioSteps {

    BasePage basePage;
    LoginPage loginPage;
    HomePage homePage;

    /***********************************
     *
     * BASE STEPS
     /***********************************
     */

    @Step("Navigating to login Link")
    public void navigateToLogin() {
        homePage.navigateTologin();
    }

    @Step("Entering user info")
    public void enterUserInfo(String userName, String password) {
        loginPage.enterUserInfo(userName, password);
    }

    @Step("Clicking on Log in button")
    public void login() {
        loginPage.login();
    }

    @Step("Clicking on Welcome page ")
    public void navigateToWelcomePage() {
        homePage.navigateToWelcomePage();
    }

    @Step("Read Welcome text ")
    public String getWelcomeText() {
        return homePage.getWelcomeText();
    }

    @Step("Navigating to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }
}