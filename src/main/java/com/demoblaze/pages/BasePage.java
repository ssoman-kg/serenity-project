package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    private static final String HOME_PAGE_LOGO = "//a[@class='navbar-brand']";

    //Open Home page
    //@return
    //Open Home page
    //@return
    public HomePage navigateToHome() {

        waitFor(HOME_PAGE_LOGO).$(HOME_PAGE_LOGO).click();
        return this.switchToPage(HomePage.class);

    }

    public HomePage addNewUserInfo(String userName, String password) {
        waitFor(USER_NAME_FIELD).$(USER_NAME_FIELD).click();
        return this.switchToPage(HomePage.class);
    }

}

