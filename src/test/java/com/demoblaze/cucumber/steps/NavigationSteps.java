package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.AboutPage;
import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import com.demoblaze.pages.SignupPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
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
        String homepageUrl = homePage.getUrl();
        Assert.assertEquals("https://www.demoblaze.com/index.html", homepageUrl);
    }

    @Step("Verify if Contact Form is open")
    public void verifyContactForm() {
        String contactModalTitle = contactPage.findTitle();
        Assert.assertEquals("New message", contactModalTitle); }

    @Step("Verify if About us video is open")
    public void verifyAboutUs() {
        String aboutModalTitle = aboutPage.findTitle();
        assertEquals("About us", aboutModalTitle); }

    @Step("Verify if Cart Page is open")
    public void verifyCartPage() {
        String cartPageUrl = homePage.getUrl();
        Assert.assertEquals("https://www.demoblaze.com/cart.html", cartPageUrl);
    }

    @Step("Verify Login Modal Title")
    public void verifySignInModalTitle() {
        String loginModalTitle = loginPage.findTitle();
        Assert.assertEquals("Log in", loginModalTitle);
    }

    @Step("Verify Welcome text")
    public void verifyWelcomeText(String userName) {
        try {
            String welcomeText = homePage.getWelcomeText();
            assertEquals("Welcome " + userName, welcomeText);
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        } catch (UnhandledAlertException e) {
            fail("Login failed");
        }
    }

    @Step("Verify if Sign in text is available")
    public void verifySignedOut() {
        try {
            String login = homePage.getLoginText();
            Assert.assertEquals("Log in", login);
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        }
    }

    @Step("Verify if Sign up modal title is correct")
    public void verifySignUpModal() {
        String signUpModalTitle = signupPage.getSignUpTitle();
        Assert.assertEquals("Sign up", signUpModalTitle);
    }
}