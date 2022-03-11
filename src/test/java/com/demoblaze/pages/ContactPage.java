package com.demoblaze.pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ContactPage extends BasePage {

    private static final String CONTACT_MODAL_TITLE = "//h5[contains(@class, 'modal-title') and text() = 'New message']";
    private static final String CONTACT_EMAIL = "//*[@id='recipient-email']";
    private static final String CONTACT_NAME = "//*[@id='recipient-name']";
    private static final String CONTACT_MESSAGE = "//*[@id='message-text']";
    private static final String SEND_BUTTON = "//button[contains(text(),'Send message')]";

    public String findTitle() {
        return getText(CONTACT_MODAL_TITLE);
    }

    public void enterContactMessage(String email, String name, String message) {
        inputValue(CONTACT_EMAIL, email);
        inputValue(CONTACT_NAME, name);
        inputValue(CONTACT_MESSAGE, message);
    }
    public void clickSendMessage() {
        try{ click(SEND_BUTTON);}
        catch (UnhandledAlertException e){
            fail("Wrong alert shown");
        }
    }

    public void verifyContactTitle() {
        String contactModalTitle = findTitle();
        Assert.assertEquals("New message", contactModalTitle);
    }

    public void verifyAlertMessage() {
        try {
            waitingForAlert();
            String messageSentAlertText = getAlertText();
            assertEquals("Thanks for the message!!", messageSentAlertText);
        } catch (NoAlertPresentException | TimeoutException e) {
            fail("Alert not shown");
        }
    }
}