package com.demoblaze.pages;

public class HomePage  extends BasePage{

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";
    private static final String SIGN_UP_LINK = "//a[contains(text(),'Sign up')]";

    /**
     * Method to Navigate to Home Page
     */
    public void navigateToHomePage() {
        open();
        waitForTextToAppear("PRODUCT STORE");
        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();

    }
    /**
     * Method used to CLICK ON sign Up Link
     */

    public void navigateToSignUp() {
        waitFor(SIGN_UP_LINK).$(SIGN_UP_LINK).click();

    }

}