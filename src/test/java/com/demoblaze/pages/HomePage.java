package com.demoblaze.pages;

public class HomePage extends BasePage {

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";
    private static final String SIGN_UP_LINK = "//a[contains(text(),'Sign up')]";
    private static final String LOG_IN_LINK = "//a[contains(text(),'Log in')]";
    private static final String LOG_OUT_LINK = "//a[contains(text(),'Log out')]";
    private static final String WELCOME_NAME = "//*[@id='nameofuser']";
    private static final String HOME_LINK = "//a[contains(text(),'Home')]";
    private static final String CONTACT_LINK = "//a[contains(text(),'Contact')]";
    private static final String ABOUT_US_LINK = "//a[contains(text(),'About us')]";
    private static final String CART_LINK = "//a[contains(text(),'Cart')]";

    public void navigateToHomePage() {
        open();
        click("PRODUCT STORE", HOME_PAGE_LOGO);
    }

    public void navigateToSignUp() {
        click("Sign up", SIGN_UP_LINK);
    }

    public void navigateToLogOut() {
        click("Log out", LOG_OUT_LINK);
    }

    public void navigateToLogin() {
        click("Log in", LOG_IN_LINK);
    }

    public void navigateToWelcomePage() {
        open();
        click(WELCOME_NAME);
    }

    /**
     * Method used to read Welcome text
     *
     * @return
     */
    public String getWelcomeText() {
        return getText(WELCOME_NAME);
    }

    /**
     * Method used to read Login text
     *
     * @return
     */
    public String getLoginText() {
        return getText(LOG_IN_LINK);
    }


    public void navigateToHomeLink() {
        click("Home",HOME_LINK );
    }

    public void navigateToContact() {
        click("Contact",CONTACT_LINK );
    }

    public void navigateToCart() {
        click("Cart",CART_LINK );
    }

    public void navigateToAboutUs() {
        click("About us",ABOUT_US_LINK );
    }

    public String getSignupText() { return getText(SIGN_UP_LINK);
    }
}