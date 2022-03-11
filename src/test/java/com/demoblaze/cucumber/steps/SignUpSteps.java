package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignupPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Alert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SignUpSteps extends ScenarioSteps {

    SignupPage signupPage;
    HomePage homePage;
    BasePage basePage;


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

    @Step("Verifying alert saying User exists")
    public void verifyIfUserExist() {
        signupPage.verifyIfUserExist();
    }

    @Step("Verifying alert saying Signup is Successful")
    public void verifySuccessfulSignup() {  signupPage.verifySuccessfulSignup(); }

}