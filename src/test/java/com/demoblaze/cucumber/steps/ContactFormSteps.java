package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.ContactPage;
import com.demoblaze.pages.HomePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ContactFormSteps extends ScenarioSteps {

    ContactPage contactPage;
    HomePage homePage;

    /***********************************
     *
     * CONTACT FORM STEPS
     /***********************************
     */

    public void navigateToHomePage()  { homePage.navigateToHomePage(); }

    public void navigateToContact() { homePage.navigateToContact(); }

    public String findTitle() { return contactPage.findTitle(); }

    public void enterMessageInfo(String email, String name, String message) {
        contactPage.enterContactMessage(email, name, message);
    }

    public void sendMessage() { contactPage.clickSendMessage(); }
}

