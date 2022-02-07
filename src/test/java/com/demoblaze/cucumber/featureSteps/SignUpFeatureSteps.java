package com.demoblaze.cucumber.featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

import com.demoblaze.cucumber.steps.SingUpSteps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class SignUpFeatureSteps {

    @Steps
    SingUpSteps signupUser;

    @Managed
    WebDriver driver;

    @Given("user is at DemoBlaze home page")
    public void userNavigateToTheHomePage() {
        signupUser.navigateToHomePage();
    }

    @And("user clicks on the Sign up link")
    public void userClicksOnTheSignupLink() {
        signupUser.navigateToSignUp();
    }

    @When("user enters the {string} and {string}")
    public void userAddUserNameAndPassword(String userName, String password) {
        signupUser.addNewUserInfo(userName, password);
    }

    @And("user clicks on Sign up button")
    public void userClicksOnSignUp() {
        signupUser.signUp();
    }

    @Then("an alert message should say the user already exist")
    public void userViewTheAlertMessageSayingTheUserExist() {
        try {
//            WebDriverWait wait = new WebDriverWait(driver, 1);
//            wait.until(ExpectedConditions.alertIsPresent());
            Alert signupFailedAlert = driver.switchTo().alert();
            String signupFailedAlertText = signupFailedAlert.getText();
            assertEquals("This user already exist.", signupFailedAlertText);
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
      }

    @Then("an alert message should say Sign up is successful")
    public void userViewTheAlertMessageSayingSignUpIsSuccessful() {
        try {
//            WebDriverWait wait = new WebDriverWait(driver, 1);
//            wait.until(ExpectedConditions.alertIsPresent());
            Alert signupSuccessfulAlert = driver.switchTo().alert();
            String signupSuccessfulAlertText = signupSuccessfulAlert.getText();
            assertEquals("Sign up successful.", signupSuccessfulAlertText);
        } catch (NoAlertPresentException e) {
           fail("Alert not shown");
        }
    }
}

