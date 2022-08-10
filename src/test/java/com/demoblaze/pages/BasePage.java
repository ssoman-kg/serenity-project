package com.demoblaze.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends PageObject {

    public void navigateToDemoBlaze() {
        open();
        WebDriver driver = Serenity.getDriver();
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

    public void wait(String text, String locator) {
        waitForTextToAppear(text);
        waitFor(locator).$(locator);
    }

    public String getText(String locator) {
        return waitFor(locator).$(locator).getText();
    }

    public String getUrl() {
        return getDriver().getCurrentUrl();
    }

    public void waitUntilAlertIsPresent() throws InterruptedException {
        waitFor(ExpectedConditions.alertIsPresent());
        getAlert();
    }
    public String getAlertText() {
        return getAlert().getText();
    }

    public void dismissAlert() {
        getAlert().dismiss();
    }

    public void acceptAlert() {
        getAlert().accept();
    }
    public boolean isAlertPresent() {
        try {
            getAlert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public boolean isElementDisplayed(String locator) {
        return $(locator).isDisplayed();
    }

    public String getAltText(String locator){
        return $(locator).getAttribute("alt");
    }
}
