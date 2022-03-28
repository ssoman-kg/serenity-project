package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageObject {

    public void inputValue(String field, String value) {
        waitFor(field).$(field).type(value);
    }

    public String getElementText(String locator) {
        return waitFor(locator).$(locator).getTextContent();
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
        return getDriver().getCurrentUrl();
    }

    public void waitUntilAlertIsPresent() {
        waitFor(ExpectedConditions.alertIsPresent());
    }

    public String getAlertText() {
         return getAlert().getText();
    }

    public boolean isElementDisplayed(String locator) {
        return waitFor(locator).$(locator).isDisplayed();
    }
}