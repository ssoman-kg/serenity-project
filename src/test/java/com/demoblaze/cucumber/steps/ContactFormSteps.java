package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ContactFormSteps extends ScenarioSteps {

    ContactPage contactPage;
    HomePage homePage;

    @Step("Navigate to Home page")
    public void navigateToHomePage()  {
        homePage.navigateToHomePage();
    }

    @Step("Navigate to Contact Form")
    public void navigateToContact() {
        homePage.navigateToContact();
    }

    @Step("Entering message info")
    public void enterMessageInfo(String email, String name, String message) {
        contactPage.enterContactMessage(email, name, message);
    }

    @Step("Click on Send message button")
    public void sendMessage() {
        contactPage.clickSendMessage();
    }

    @Step("Verify Contact form Title")
    public void verifyContactForm() {
        assertEquals("New message", contactPage.getContactModalTitle());
    }

    @Step("Verify if Alert message is correct")
    public void verifyAlertMessage() {
        try {
            contactPage.waitUntilAlertIsPresent();
            assertEquals("Thanks for the message!!", contactPage.getAlertText());
        } catch (NoAlertPresentException | TimeoutException e) {
            fail("Alert not shown");
        }
    }
}