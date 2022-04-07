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
    private static final String CATEGORIES_LIST1 = "//a[@class='list-group-item'][1]";
    private static final String CATEGORIES_LIST2 = "//a[@class='list-group-item'][2]";
    private static final String CATEGORIES_LIST3 = "//a[@class='list-group-item'][3]";
    private static final String CATEGORIES_LIST4 = "//a[@class='list-group-item'][4]";
    private static final String PRODUCTS_TITLE_LIST1 = "//*[@id='tbodyid']/div[1]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST2 = "//*[@id='tbodyid']/div[2]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST3 = "//*[@id='tbodyid']/div[3]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST4 = "//*[@id='tbodyid']/div[4]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST5 = "//*[@id='tbodyid']/div[5]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST6 = "//*[@id='tbodyid']/div[6]/div/div/h4/a";
    private static final String PRODUCTS_TITLE_LIST7 = "//*[@id='tbodyid']/div[7]/div/div/h4/a";

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
        return getText(CATEGORIES_LIST1);
    }

    public void clickCategories() {
        click(CATEGORIES_LIST1);
    }

    public String getCategoriesPhonesText() {
        return getText(CATEGORIES_LIST2);
    }

    public void clickPhoneCategory() {
        click(CATEGORIES_LIST2);
    }

    public String getCategoriesLaptopsText() {
        return getText(CATEGORIES_LIST3);
    }

    public void clickLaptopCategory() {
        click(CATEGORIES_LIST3);
    }

    public String getCategoriesMonitorsText() {
        return getText(CATEGORIES_LIST4);
    }

    public void clickMonitorCategory() {
        click(CATEGORIES_LIST4);
    }

    public String [] getPhonesTitle() {
        String P1 = getText(PRODUCTS_TITLE_LIST1);
        String P2 = getText(PRODUCTS_TITLE_LIST2);
        String P3 = getText(PRODUCTS_TITLE_LIST3);
        String P4 = getText(PRODUCTS_TITLE_LIST4);
        String P5 = getText(PRODUCTS_TITLE_LIST5);
        String P6 = getText(PRODUCTS_TITLE_LIST6);
        String P7 = getText(PRODUCTS_TITLE_LIST7);
        String [] phoneArray = new String[] { P1, P2, P3, P4, P5, P6, P7};
        System.out.println(phoneArray);
        return phoneArray;
    }

    public String [] getLaptopsTitle() {
        String L1 = getText(PRODUCTS_TITLE_LIST1);
        String L2 = getText(PRODUCTS_TITLE_LIST2);
        String L3 = getText(PRODUCTS_TITLE_LIST3);
        String L4 = getText(PRODUCTS_TITLE_LIST4);
        String L5 = getText(PRODUCTS_TITLE_LIST5);
        String L6 = getText(PRODUCTS_TITLE_LIST6);
        String [] laptopArray = new String[] { L1, L2, L3, L4, L5, L6};
        System.out.println(laptopArray);
        return laptopArray;
    }
    public String [] getMonitorsTitle() {
        String M1 = getText(PRODUCTS_TITLE_LIST1);
        String M2 = getText(PRODUCTS_TITLE_LIST2);
        String [] monitorArray = new String[] { M1, M2};
        System.out.println(monitorArray);
        return monitorArray;
    }
}