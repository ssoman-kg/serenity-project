package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LogInSteps extends ScenarioSteps {

    LoginPage loginPage;
    HomePage homePage;

    /****************************
     * LOGIN STEPS
     * /**************************
     *  */

    @Step("Navigating to login Link")
    public void navigateToLogin() {
        homePage.navigateToLogin();
    }

    @Step("Entering user info")
    public void enterUserInfo(String userName, String password) {
        loginPage.enterUserInfo(userName, password);
    }

    @Step("Clicking on Log in button")
    public void login() {
        loginPage.login();
    }

    @Step("Navigating to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

    @Step("Verifying if the Welcome text is shown and correct")
    public void verifyWelcomeMessage(String userName) {
        try {
             assertEquals("Welcome " + userName, homePage.getWelcomeText());
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        } catch (UnhandledAlertException e) {
            fail("Login failed");
        }
    }

    @Step("Verifying if the user login is incorrect")
    public void verifyIncorrectLogin() {
        try {
            loginPage.waitUntilAlertIsPresent();
            assertEquals("Wrong password.", loginPage.getAlertText());
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }

    @Step("Verifying if the user name is incorrect")
    public void verifyWrongUser() {
        try {
            loginPage.waitUntilAlertIsPresent();
            assertEquals("User does not exist.", loginPage.getAlertText());
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }
}
