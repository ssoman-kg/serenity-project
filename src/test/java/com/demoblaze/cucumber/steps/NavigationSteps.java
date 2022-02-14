package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class NavigationSteps extends ScenarioSteps {

    BasePage basePage;
    LoginPage loginPage;
    HomePage homePage;
    ContactPage contactPage;
    AboutPage aboutPage;

    /***********************************
     *
     * NAVIGATION STEPS
     /***********************************
     */

    @Step("Entering user info")
    public void enterUserInfo(String userName, String password) {
        loginPage.enterUserInfo(userName, password);
    }

    @Step("Clicking on Log in button")
    public void login() {
        loginPage.login();
    }

    @Step("Read Welcome text ")
    public String getWelcomeText() {
        return homePage.getWelcomeText();
    }

    @Step("Navigating to Home page")
    public void navigateToHomePage() {homePage.navigateToHomePage();}

    @Step("Navigating to Home link")
    public void navigateToHomeLink() {
        homePage.navigateToHomeLink();
    }

    @Step("Navigating to Contact page")
    public void navigateToContact() {
        homePage.navigateToContact();
    }

    @Step("Navigating to About us page")
    public void navigateToAboutUs() {
        homePage.navigateToAboutUs();
    }

    @Step("Navigating to Cart page")
    public void navigateToCart() {
        homePage.navigateToCart();
    }

    @Step("Navigating to Login page")
    public void navigateToLogin() {
        homePage.navigateToLogin();
    }

    @Step("Navigating to Log out")
    public void navigateToLogOut() {
        homePage.navigateToLogOut();
    }

    @Step("Navigating to Sign Up")
    public void navigateToSignUp() {
        homePage.navigateToSignUp();
    }

    @Step("Get the URL")
    public String getUrl() { return basePage.getUrl();}

    @Step("Read Contact Modal Title text ")
    public String findTitle() { return contactPage.findTitle();}

    @Step("Read About Video Title text ")
    public String findVideoTitle() { return aboutPage.findTitle();}

    @Step("Read Login Modal Title text ")
    public String findLoginTitle() {return loginPage.findTitle();}

    @Step("Read Login Link Title text ")
    public String getLoginText() { return homePage.getLoginText();}

    @Step("Read Signup Link Title text ")
    public String getSignUpTitle() { return homePage.getSignupText();}
}