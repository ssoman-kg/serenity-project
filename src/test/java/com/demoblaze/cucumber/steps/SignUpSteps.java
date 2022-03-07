package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignupPage;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SignUpSteps extends ScenarioSteps {

    SignupPage signupPage;
    HomePage homePage;

    @Managed
    WebDriver driver;

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

    public void verifyIfUserExist() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert signupFailedAlert = driver.switchTo().alert();
            String signupFailedAlertText = signupFailedAlert.getText();
            assertEquals("This user already exist.", signupFailedAlertText);
            driver.close();
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }

    public void verifySuccessfulSignup() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert signupSuccessfulAlert = driver.switchTo().alert();
            String signupSuccessfulAlertText = signupSuccessfulAlert.getText();
            assertEquals("Sign up successful.", signupSuccessfulAlertText);
            driver.close();
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }
}
