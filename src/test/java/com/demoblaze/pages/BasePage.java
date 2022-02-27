package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;


public class BasePage extends PageObject {

    public void inputValue(String field, String value) {
        waitFor(field).$(field).type(value);
    }

    public void click(String locator) {
        waitFor(locator).$(locator).click();
    }


    public String show(String locator) {
        return waitFor(locator).$(locator).getTextContent();
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
        return getDriver().getCurrentUrl();
    }


}

