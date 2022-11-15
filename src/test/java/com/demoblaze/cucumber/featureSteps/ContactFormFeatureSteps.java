package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.BaseSteps;
import com.demoblaze.cucumber.steps.ContactFormSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactFormFeatureSteps {

    @Steps
    ContactFormSteps contactFormUser;

    @Steps
    BaseSteps baseUser;

    @Given("user is at the DemoBlaze landing page")
    public void userIsAtDemoBlazeLandingPage() {
        baseUser.navigateToHomePage();
    }

    @When("user clicks on  Contact link")
    public void userClicksOnContactLink() {
        contactFormUser.navigateToContact();
    }

    @Then("contact form should open")
    public void contactFormShouldOpen() {
        contactFormUser.verifyContactForm();
    }

    @And("user fills {word}, {word} and {word}")
    public void userFillsEmailNameAndMessage(String email, String name, String message) {
        contactFormUser.enterMessageInfo(email, name, message);
    }

    @And("an alert should say Thanks for the message!!")
    public void anAlertShouldSayThanksForTheMessage() {
        contactFormUser.verifyAlertMessage();
    }
}

