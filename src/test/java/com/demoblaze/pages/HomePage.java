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



    /**
     * Method to Navigate to Home Page
     */
    public void navigateToHomePage() {
        open();
        click("PRODUCT STORE", HOME_PAGE_LOGO);
    }

    /**
     * Method used to CLICK ON sign Up Link
     */

    public void navigateToSignUp() {
        click("Sign up", SIGN_UP_LINK);
    }


    /**
     * Method used to click on Log out Link
     */
    public void navigateToLogOut() {

        click("Log out", LOG_OUT_LINK);
    }

    /**
     * Method used to click on Log in Link
     */
    public void navigateTologin() {

        click("Log in", LOG_IN_LINK);
    }

    /**
     * Method used to click on Welcome Link
     */
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


    public void navigateToHomeLink() {click("Home",HOME_LINK );
    }

    public void navigateToContact() {click("Contact",CONTACT_LINK );
    }

    public void navigateToCart() {click("Cart",CART_LINK );
    }

    public void navigateToAboutUs() {
        click("About us",ABOUT_US_LINK );
    }
}