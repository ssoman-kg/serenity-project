package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage extends PageObject {


    public void inputValue(String field, String value) {
        waitFor(field).$(field).type(value);
    }

    public void click(String locator) {
        waitFor(locator).$(locator).click();
    }

    /**
     * Overloaded click Method
     */
    public void click(String text, String locator) {
        waitForTextToAppear(text);
        waitFor(locator).$(locator).click();
    }

    public String getText(String locator) {
        return waitFor(locator).$(locator).getText();
    }

    public String getUrl() {
        WebDriver driver = new ChromeDriver();
        return driver.getCurrentUrl();
    }
}

