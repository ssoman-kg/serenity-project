package com.demoblaze.pages;

import net.serenitybdd.core.Serenity;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends BasePage {

    WebDriver driver = Serenity.getDriver();

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
    private static final String PREVIOUS_SLIDE_BUTTON = "//*[@class='carousel-control-prev-icon']";
    private static final String NEXT_SLIDE_BUTTON = "//*[@class='carousel-control-next-icon']";
    private static final String CATEGORIES = "//a[@id='cat']";
    private static final String PHONES_CATEGORY = "//a[contains(text(),'Phones')]";
    private static final String LAPTOPS_CATEGORY = "//a[contains(text(),'Laptops')]";
    private static final String MONITORS_CATEGORY = "//a[contains(text(),'Monitors')]";
    public static final String FIRST_SLIDE = "//img[@alt='First slide']";
    public static final String SECOND_SLIDE = "//img[@alt='Second slide']";
    public static final String THIRD_SLIDE = "//img[@alt='Third slide']";

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
     */
    public String getWelcomeText() {
        return getText(WELCOME_NAME);
    }

    /**
     * Method used to read Login text
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
     */
    public String getSignupText() {
        return getText(SIGN_UP_LINK);
    }

    /**
     * Method used to read Product text
     *
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

    public String getNextButtonText() {
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
        return getText(CATEGORIES);
    }

    public void clickCategories() {
        click(CATEGORIES);
    }

    public String getCategoriesPhonesText() {
        return getText(PHONES_CATEGORY);
    }

    public void clickPhoneCategory() {
        click(PHONES_CATEGORY);
    }

    public String getCategoriesLaptopsText() {
        return getText(LAPTOPS_CATEGORY);
    }

    public void clickLaptopCategory() {
        click(LAPTOPS_CATEGORY);
    }

    public String getCategoriesMonitorsText() {
        return getText(MONITORS_CATEGORY);
    }

    public void clickMonitorCategory() {
        click(MONITORS_CATEGORY);
    }

    public List<WebElement> getProductTitles() {
        return driver.findElements(By.className("card-title"));
    }

    public void clickPreviousSlideButton() {
        click(PREVIOUS_SLIDE_BUTTON);
    }

    public void clickNextSlideButton() {
        click(NEXT_SLIDE_BUTTON);
    }

}

