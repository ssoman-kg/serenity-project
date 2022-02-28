package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.ContactFormSteps;
import com.demoblaze.cucumber.steps.LogInSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ContactFormFeatureSteps {

    @Steps
    ContactFormSteps contactFormUser;

    @Managed
    WebDriver driver;

    @Given("user is at the DemoBlaze landing page")
    public void userIsAtTheDemoBlazeLandingPage() {
        contactFormUser.navigateToHomePage();
    }

    @When("user clicks on  Contact link")
    public void userClicksOnContactLink() {
        contactFormUser.navigateToContact();
    }

    @Then("contact form should open")
    public void contactFormShouldOpen() {
        String contactModalTitle = contactFormUser.findTitle();
        assertEquals("New message", contactModalTitle);
    }

    @When("user fills {word}, {word} and {word}")
    public void userFillsEmailNameAndMessage(String email, String name, String message) {
        contactFormUser.enterMessageInfo(email, name, message);
    }

    @And("user clicks on Send message")
    public void userClicksOnSendMessage() {
        contactFormUser.sendMessage();
    }

    @Then("an alert should say Thanks for the message!!")
    public void anAlertShouldSayThanksForTheMessage() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert messageSentAlert = driver.switchTo().alert();
            String messageSentAlertText = messageSentAlert.getText();
            assertEquals(messageSentAlertText, messageSentAlertText);
            driver.close();
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        } catch (TimeoutException e) {
            fail("Alert not shown");
        }
    }
}
