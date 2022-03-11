package com.demoblaze.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SignupPage extends BasePage {

    private static final String USER_NAME_FIELD = "//*[@id='sign-username']";
    private static final String PASSWORD_FIELD = "//*[@id='sign-password']";
    private static final String SIGN_UP_BUTTON = "//button[contains(text(),'Sign up')]";

    public void addNewUserInfo(String userName, String password) {
        inputValue(USER_NAME_FIELD, userName);
        inputValue(PASSWORD_FIELD, password);
    }

    public void signUp() {
        click(SIGN_UP_BUTTON);
    }

    public void verifyIfUserExist() {
      try {
          waitingForAlert();
            String signupFailedAlertText= getAlertText();
            assertEquals("This user already exist.", signupFailedAlertText);
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }}

    public void verifySuccessfulSignup() {
        waitingForAlert();
        try {
            String signupSuccessAlertText= getAlertText();
            assertEquals("Sign up successful.", signupSuccessAlertText);
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
        }}