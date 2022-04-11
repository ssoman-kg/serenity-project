package com.demoblaze.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithByLocator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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

    public String getTextt(List<WebElement> locator) {
        return $((WithByLocator) locator).getText();
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

    public boolean isAlertPresent()
    {
        try
        {getAlert();
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

//    @Before
//    public void setUp() throws Exception {
//        System.setProperty("webdriver.chrome.driver", "ChromeDriver");
//        DesiredCapabilities capabilities = DesiredCapabilities.Chrome();
//        capabilities.setCapability("marionette", true);
//       ChromeDriver driver = new ChromeDriver(capabilities);
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
}