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
    private static final String PREVIOUS_BUTTON = "//button[contains(text(),'Previous')]";
    private static final String NEXT_BUTTON = "//button[contains(text(),'Next')]";
    private static final String FIRST_PRODUCT = "(//a[@class='hrefch'])[1]";
    private static final String LAST_PRODUCT = "(//a[@class='hrefch'])[last ()]";
    private static final String[] CATEGORIES_LIST = {"//a[@class='list-group-item']"};
    private static final String[] PRODUCTS_TITLE_LIST = {"//*[@class='card-title']"};

    private static final String CATEGORIES_LIST1 = "//a[@class='list-group-item'][1]";
    private static final String CATEGORIES_LIST2 = "//a[@class='list-group-item'][2]";
    private static final String CATEGORIES_LIST3 = "//a[@class='list-group-item'][3]";
    private static final String CATEGORIES_LIST4 = "//a[@class='list-group-item'][4]";

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
        click("Home", HOME_LINK);
    }

    public void navigateToContact() {
        click("Contact", CONTACT_LINK);
    }

    public void navigateToCart() {
        click("Cart", CART_LINK);
    }

    /**
     * Method used to read Signup text
     *
     * @return
     */
    public String getSignupText() {
        return getText(SIGN_UP_LINK);
    }

    /**
     * MethodS used to read Product text
     *
     * @return
     */
    public String getFirstProductText() {
        return getText(FIRST_PRODUCT);
    }

    public String getLastProductText() {
        return getText(LAST_PRODUCT);
    }

    public void clickPrevious() {
        click(PREVIOUS_BUTTON);
    }

    public String getPreviousButtonText() {
        return getElementText(PREVIOUS_BUTTON);
    }

    public void clickNext() {
        click(NEXT_BUTTON);
    }

    public Object getNextButtonText() {
        return getElementText(NEXT_BUTTON);
    }

    public void navigateToAboutUs() {
        click("About us", ABOUT_US_LINK);
    }

    public boolean verifyNextButtonDisplayed() {
        return isElementDisplayed(NEXT_BUTTON);
    }

    public boolean verifyPreviousButtonDisplayed() {
        return isElementDisplayed(PREVIOUS_BUTTON);
    }

    public String getCategoriesHeadingText() {
//        System.out.println(getText(CATEGORIES_LIST[1]));
//        return getText(CATEGORIES_LIST[1]);
        return getText(CATEGORIES_LIST1);
    }

    public void clickCategories() {
        // click(CATEGORIES_LIST[1]);
        click(CATEGORIES_LIST1);
    }

    public String getCategoriesPhonesText() {
        // System.out.println(getText(CATEGORIES_LIST[2]));
        // return getText(CATEGORIES_LIST[2]);
        return getText(CATEGORIES_LIST2);
    }


    public void clickPhoneCategory() {
        //click(CATEGORIES_LIST[2]);
        click(CATEGORIES_LIST2);
    }

    public String getCategoriesLaptopsText() {
//        System.out.println(getText(CATEGORIES_LIST[3]));
//
//        return getText(CATEGORIES_LIST[3]);
        return getText(CATEGORIES_LIST3);
    }


    public void clickLaptopCategory() {
        // click(CATEGORIES_LIST[3]);
        click(CATEGORIES_LIST3);
    }

    public String getCategoriesMonitorsText() {
//        System.out.println(getText(CATEGORIES_LIST[4]));
//
//        return getText(CATEGORIES_LIST[4]);
        return getText(CATEGORIES_LIST4);

    }

    public void clickMonitorCategory() {
        //click(CATEGORIES_LIST[4]);
        click(CATEGORIES_LIST4);
    }


    public String getProductTitle() {
        for (int i = 0; i < 7; i++)
        { System.out.println(i);
            getText(PRODUCTS_TITLE_LIST[i]);}
        return getProductTitle();
    }

}
