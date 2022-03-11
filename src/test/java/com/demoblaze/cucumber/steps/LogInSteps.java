package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

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

<<<<<<< HEAD
    @Step("Read Welcome text ")
    public String getWelcomeText() {
        return homePage.getWelcomeText();
    }

=======
>>>>>>> testcase_4_contact_form
    @Step("Navigating to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }

    @Step("Verifying if the Welcome text is shown and correct")
    public void verifyWelcomeMessage(String userName) { loginPage.verifyWelcomeText(userName); }

    @Step("Verifying if the user login is incorrect")
    public void verifyIncorrectLogin() { loginPage.verifyWrongLogin(); }

    @Step("Verifying if the user name is incorrect")
    public void verifyWrongUser() { loginPage.verifyWrongUserName(); }
}