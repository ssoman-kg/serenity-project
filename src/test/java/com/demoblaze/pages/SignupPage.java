package com.demoblaze.pages;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class SignupPage extends BasePage {

    private static final String SIGNUP_MODAL_TITLE = "//*[@id='signInModalLabel']";
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
        }
    }

    public void verifySuccessfulSignup() {
        try {
            waitingForAlert();
            String signupSuccessAlertText= getAlertText();
            assertEquals("Sign up successful.", signupSuccessAlertText);
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }

    public void verifyModaltitle() {
        String signUpModalTitle = getSignUpTitle();
        Assert.assertEquals("Sign up", signUpModalTitle);
    }

    private String getSignUpTitle() {
        return getText(SIGNUP_MODAL_TITLE);
    }
}
