package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;

public class BasePage extends PageObject {

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";
    private static final String SIGN_UP_LINK = "//a[contains(text(),'Sign up')]";

    /**
     * Method to Navigate to Home Page
     * @return
     */
    public HomePage navigateToHomePage() {
        open();
        waitForTextToAppear("PRODUCT STORE");
        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();
        return null;
    }
    /**
     * Method used to CLICK ON sign Up Link
     * @return
     */

    public SignupPage navigateToSignUpPage() {
        waitFor(SIGN_UP_LINK).$(SIGN_UP_LINK).click();
        return null;
    }


}

