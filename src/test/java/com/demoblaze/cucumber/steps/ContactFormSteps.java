package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class ContactFormSteps extends ScenarioSteps {

    ContactPage contactPage;
    HomePage homePage;

    /***********************************
     * CONTACT FORM STEPS
     /***********************************
     */

    @Step("Navigate to Contact Form")
    public void navigateToContact() {
        homePage.navigateToContact();
    }

    @Step("Verify Contact form Title")
    public void verifyContactForm() {
        assertEquals("New message", contactPage.getContactModalTitle());
    } @Step("Entering message info")
    public void enterMessageInfo(String email, String name, String message) {
        contactPage.enterContactMessage(email, name, message);
    }

//    @Step("Click on Send message button")
//    public void sendMessage() {
//        contactPage.clickSendMessage();
////        contactPage.waitUntilAlertIsPresent();
////        System.out.println(contactPage.isAlertPresent());
////        assertTrue(contactPage.isAlertPresent());
////        assertEquals("Thanks for the message!!", contactPage.getAlertText());
////        contactPage.acceptAlert();
//    }

    @Step("Verify if Alert message is correct")
    public void verifyAlertMessage() {
        contactPage.clickSendMessage();

        contactPage.waitUntilAlertIsPresent();
        System.out.println(contactPage.isAlertPresent());
        assertTrue(contactPage.isAlertPresent());
        assertEquals("Thanks for the message!!", contactPage.getAlertText());
        contactPage.acceptAlert();
    }
}