package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.SignupPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NavigationSteps extends ScenarioSteps {

    LoginPage loginPage;
    HomePage homePage;
    ContactPage contactPage;
    AboutPage aboutPage;
    SignupPage signupPage;

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
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

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

    @Step("Verify if Home page is open")
    public void verifyHomePageOpen() {
        assertEquals("https://www.demoblaze.com/index.html", homePage.getUrl());
    }

    @Step("Verify if Contact Form is open")
    public void verifyContactForm() {
        assertEquals("New message", contactPage.getContactModalTitle()); }

    @Step("Verify if About us video is open")
    public void verifyAboutUs() {
        assertEquals("About us", aboutPage.getAboutModalTitle()); }

    @Step("Verify if Cart Page is open")
    public void verifyCartPage() {
        assertEquals("https://www.demoblaze.com/cart.html", homePage.getUrl());
    }

    @Step("Verify Login Modal Title")
    public void verifySignInModalTitle() {
        assertEquals("Log in", loginPage.getLoginModalTitle());
    }

    @Step("Verify Welcome text")
    public void verifyWelcomeText(String userName) {
        try {
            assertEquals("Welcome " + userName, homePage.getWelcomeText());
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        } catch (UnhandledAlertException e) {
            fail("Login failed");
        }
    }

    @Step("Verify if Sign in text is available")
    public void verifySignedOut() {
        try {
            assertEquals("Log in", homePage.getLoginText());
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        }
    }

    @Step("Verify if Sign up modal title is correct")
    public void verifySignUpModal() {
        assertEquals("Sign up", signupPage.getSignUpTitle());
    }

}