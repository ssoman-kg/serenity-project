package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.BaseSteps;
import com.demoblaze.cucumber.steps.SignUpSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SignUpFeatureSteps {

    @Steps
    SignUpSteps signupUser;

    @Steps
    BaseSteps baseUser;

    @Given("user is at DemoBlaze home page")
    public void userIsAtDemoBlazeLandingPage() {
        baseUser.navigateToHomePage();
    }

    @And("user clicks on the Sign up link")
    public void userClicksOnTheSignupLink() {
        signupUser.navigateToSignUp();
    }

    @When("user enters the {word} and {word}")
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