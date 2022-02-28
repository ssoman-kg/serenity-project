package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignupPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class SingUpSteps extends ScenarioSteps {

    SignupPage signupPage;
    HomePage homePage;

    /****************************
     * SIGNUP STEPS
     * /**************************
     *  */

    @Step("Navigating to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

    @Step("Navigating to Signup Link")
    public void navigateToSignUp() {
        homePage.navigateToSignUp();
    }

    @Step("Entering info")
    public void addNewUserInfo(String userName, String password) {
        signupPage.addNewUserInfo(userName, password);
    }

    @Step("Clicking on Sign Up button")
    public void signUp() {
        signupPage.signUp();
    }
}