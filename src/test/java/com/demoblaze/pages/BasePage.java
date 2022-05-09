package com.demoblaze.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageObject {
    WebDriver driver = Serenity.getDriver();

    public void navigateToDemoBlaze() {
        open();
        driver.manage().window().maximize();
    }

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

    public void dismissAlert() {
        getAlert().dismiss();
    }

    public boolean isAlertPresent() {
        try {
            getAlert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void acceptAlert() {
        getAlert().accept();
    }

    public boolean isElementDisplayed(String locator) {
        return $(locator).isDisplayed();
    }

    public String getAltText(String locator){
        return $(locator).getAttribute("alt");
    }
}
