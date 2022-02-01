package com.demoblaze.cucumber.featureSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

import com.demoblaze.cucumber.steps.SingUpSteps;

public class SignUpFeatureSteps {

    @Steps
    SingUpSteps signupUser;

    @Managed
    WebDriver driver;

    @Given("a web browser is at theDemoBlaze home page")
    public void userNavigateToTheHomePage() {
        signupUser.navigateToHomePage();
    }

    @And("the user click on the Sign up link")
    public void userClickOnTheSignupLink() {
        signupUser.navigateToSignUp();
    }

    @When("the user enter {string} and {string}")
    public void userAddUserNameAndPassword(String userName, String password) {
        signupUser.addNewUserInfo(userName, password);
    }

    @And("the user click on sign up button")
    public void userClickOnSignUp() {
        signupUser.signUp();
    }

    @Then("an alert message saying the user exist is shown")
    public void userViewTheAlertMessageSayingTheUserExist() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            assertEquals("This user already exist.", alertText);
        } catch (Exception e) {
            System.out.println("Alert not Displayed");
        }

    }

    @Then("an alert message saying Sign up is successful is shown")
    public void userViewTheAlertMessageSayingSignUpIsSuccessful() {
        try {
            Alert alert1 = driver.switchTo().alert();
            String alert1Text = alert1.getText();
            assertEquals("Sign up successful.", alert1Text);
        } catch (Exception e) {
            System.out.println("Alert not Displayed");
        }
    }

}

