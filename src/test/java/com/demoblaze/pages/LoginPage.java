package com.demoblaze.pages;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LoginPage extends BasePage {

    HomePage homePage;

    private static final String LOGIN_MODAL_TITLE = "//*[@id='logInModalLabel']";
    private static final String USER_NAME_FIELD = "//*[@id='loginusername']";
    private static final String PASSWORD_FIELD = "//*[@id='loginpassword']";
    private static final String LOG_IN_BUTTON = "//button[contains(text(),'Log in')]";

    public String findTitle() {
        return getText(LOGIN_MODAL_TITLE);
    }

    public void enterUserInfo(String userName, String password) {
        inputValue(USER_NAME_FIELD, userName);
        inputValue(PASSWORD_FIELD, password);
    }

    public void login() {
        click(LOG_IN_BUTTON);
    }

    public void verifyWelcomeText(String name) {
        try {
            String welcomeText = homePage.getWelcomeText();
            assertEquals("Welcome " + name, welcomeText);
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        } catch (UnhandledAlertException e) {
            fail("Login failed");
        }
    }

    public void verifyWrongLogin() {
        try {
            waitingForAlert();
            String loginFailedAlertText = getAlertText();
            assertEquals("Wrong password.", loginFailedAlertText);
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }

    public void verifyWrongUserName() {
        try {
            waitingForAlert();
            String wrongUserAlertText = getAlertText();
            assertEquals("User does not exist.", wrongUserAlertText);
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }

    public void verifyModalTitle() {
        String loginModalTitle = findTitle();
        Assert.assertEquals("Log in", loginModalTitle);
    }
}