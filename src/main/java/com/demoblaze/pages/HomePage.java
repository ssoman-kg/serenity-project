package com.demoblaze.pages;

public class HomePage  extends BasePage{

    private static final String SIGN_UP_LINK = "//a[contains(text(),'Sign up')]";
    private static final String USER_NAME_FIELD = "//input[@id='sign-username']";
    private static final String PASSWORD_FIELD = "//input[@id='sign-password']";
    private static final String SIGN_UP_BUTTON = "//button[contains(text(),'Sign up')]";


    /**
     * Add New User Information
     *
     * @param userName
     * @param password
     * @return
     */
    public HomePage openStore() {
        open();
        waitForTextToAppear("PRODUCT STORE"); //use explicit wait for the text to appear
        return this;

    }

    public HomePage navigateToSignUpLink() {

        waitFor(SIGN_UP_LINK).$(SIGN_UP_LINK).click();
        return this;

    }
    public HomePage addNewUserInfo(String userName , String password) {

        $(USER_NAME_FIELD).type(userName);
        $(PASSWORD_FIELD).type(password);

        return this;
    }
    /**
     * Clicking Signup button
     *
     * @return
     */
    public HomePage clickSignUp() {

        waitFor(SIGN_UP_BUTTON).$(SIGN_UP_BUTTON).click();

        return this;
    }

}