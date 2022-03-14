package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactFormSteps extends ScenarioSteps {

    ContactPage contactPage;
    HomePage homePage;

    @Step("Navigate to Home page")
    public void navigateToHomePage()  { homePage.navigateToHomePage();}

    @Step("Navigate to Contact Form")
    public void navigateToContact() { homePage.navigateToContact(); }

    @Step("Entering message info")
    public void enterMessageInfo(String email, String name, String message) {
        contactPage.enterContactMessage(email, name, message);
    }

    @Step("Click on Send message button")
    public void sendMessage() { contactPage.clickSendMessage();}

    @Step("Verify Contact form Title")
    public void verifyContactForm() {contactPage.verifyContactTitle();}

    @Step("Verify if Alert message is correct")
    public void verifyAlertMessage() { contactPage.verifyAlertMessage();}
}