package com.demoblaze.pages;

public class LoginPage extends BasePage {

    private static final String LOGIN_MODAL_TITLE = "//*[@id='logInModalLabel']";
    private static final String USER_NAME_FIELD = "//*[@id='loginusername']";
    private static final String PASSWORD_FIELD = "//*[@id='loginpassword']";
    private static final String LOG_IN_BUTTON = "//button[contains(text(),'Log in')]";

    public String getLoginModalTitle() {
        return getText(LOGIN_MODAL_TITLE);
    }

    public void enterUserInfo(String userName, String password) {
        inputValue(USER_NAME_FIELD, userName);
        inputValue(PASSWORD_FIELD, password);
    }

    public void login() {
        click(LOG_IN_BUTTON);
    }

    @Override
    public void acceptAlert() {
        acceptAlert();
    }
}