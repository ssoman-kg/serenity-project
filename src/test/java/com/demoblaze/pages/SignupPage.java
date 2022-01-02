package com.demoblaze.pages;

public class SignupPage extends BasePage{


    private static final String USER_NAME_FIELD = "//*[@id='sign-username']";
    private static final String PASSWORD_FIELD = "//*[@id='sign-password']";
    private static final String SIGN_UP_BUTTON = "//button[contains(text(),'Sign up')]";

    public void addNewUserInfo(String userName , String password) {
        enterField("Username:", USER_NAME_FIELD, userName);
        enterField("Password:", PASSWORD_FIELD, password);
    }
    public void signUp() {
        click("Sign up", SIGN_UP_BUTTON);
    }


}
