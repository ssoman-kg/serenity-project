package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class BasePage extends PageObject {

    private WebDriver driver;

//    public void setDriver()
//    {
//        driver = new ChromeDriver();
//    }
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
        return getDriver().getCurrentUrl();
    }

    public void waitingForAlert() {waitFor(ExpectedConditions.alertIsPresent());}

    public String getAlertText() {
         return getAlert().getText();
    }

}