package com.demoblaze.pages;

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
}