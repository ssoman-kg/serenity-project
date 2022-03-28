package com.demoblaze.pages;

public class ContactPage extends BasePage {

    private static final String CONTACT_MODAL_TITLE = "//h5[contains(@class, 'modal-title') and text() = 'New message']";
    private static final String CONTACT_EMAIL = "//*[@id='recipient-email']";
    private static final String CONTACT_NAME = "//*[@id='recipient-name']";
    private static final String CONTACT_MESSAGE = "//*[@id='message-text']";
    private static final String SEND_BUTTON = "//button[contains(text(),'Send message')]";

    public String getContactModalTitle() {
        return getText(CONTACT_MODAL_TITLE);
    }

    public void enterContactMessage(String email, String name, String message) {
        inputValue(CONTACT_EMAIL, email);
        inputValue(CONTACT_NAME, name);
        inputValue(CONTACT_MESSAGE, message);
    }

    public void clickSendMessage() {
       click(SEND_BUTTON);
    }
}