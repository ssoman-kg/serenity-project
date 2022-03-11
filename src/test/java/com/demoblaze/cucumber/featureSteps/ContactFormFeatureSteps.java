package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.ContactFormSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactFormFeatureSteps {

    @Steps
    ContactFormSteps contactFormUser;

    @Given("user is at the DemoBlaze landing page")
    public void userIsAtTheDemoBlazeLandingPage() {
        contactFormUser.navigateToHomePage();
    }

    @When("user clicks on  Contact link")
    public void userClicksOnContactLink() {
        contactFormUser.navigateToContact();
    }

    @Then("contact form should open")
    public void contactFormShouldOpen() {
        contactFormUser.verifyContactForm();
    }

    @When("user fills {word}, {word} and {word}")
    public void userFillsEmailNameAndMessage(String email, String name, String message) {
        contactFormUser.enterMessageInfo(email, name, message);
    }

    @And("user clicks on Send message")
    public void userClicksOnSendMessage() {
        contactFormUser.sendMessage();
    }

    @Then("an alert should say Thanks for the message!!")
    public void anAlertShouldSayThanksForTheMessage() {
        contactFormUser.verifyAlertMessage();
    }
}
