package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import com.demoblaze.cucumber.steps.SignUpSteps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SignUpFeatureSteps {

    @Managed
    WebDriver driver;
    @Steps
    SignUpSteps signupUser;
    BasePage basePageUser;

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
        signupUser.verifyIfUserExist();
        }


    @Then("an alert message should say Sign up is successful")
    public void userViewTheAlertMessageSayingSignUpIsSuccessful() {
        signupUser.verifySuccessfulSignup();
        }
}
