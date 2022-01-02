package com.demoblaze.pages;

public class SignupPage extends BasePage{


    private static final String USER_NAME_FIELD = "//input[@id='sign-username']";
    private static final String PASSWORD_FIELD = "//input[@id='sign-password']";
    private static final String SIGN_UP_BUTTON = "//button[contains(text(),'Sign up')]";

    public SignupPage addNewUserInfo(String userName , String password) {
        waitForTextToAppear("Username:");
        waitForTextToAppear("Password:");
        waitFor(USER_NAME_FIELD).$(USER_NAME_FIELD).type(userName);
        waitFor(PASSWORD_FIELD).$(PASSWORD_FIELD).type(password);
        return null;
    }
    public SignupPage signUp() {
        waitForTextToAppear("Sign up");
        waitFor(SIGN_UP_BUTTON).$(SIGN_UP_BUTTON).click();

        return null;
    }


}
