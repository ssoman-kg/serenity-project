package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.LogInSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class LogInFeatureSteps {

    @Steps
    LogInSteps loginUser;

    @Managed
    WebDriver driver;

    @Given("user is at the DemoBlaze home page")
    public void userAtHomePage() {
        loginUser.navigateToHomePage();
    }

    @And("user clicks on the Log in link")
    public void userClicksOnTheLoginLink() {
        loginUser.navigateToLogin();
    }

    @When("user enters {word} and {word}")
    public void userEntersUserNameAndPassword(String userName, String password) {
        loginUser.enterUserInfo(userName, password);
    }

    @And("user clicks on Log in button")
    public void userClicksOnLogIn() {
        loginUser.login();
    }

    @Then("user should see Welcome {word}")
    public void UserSeeWelcomeUsername(String userName) {
        try {
            String welcomeText = loginUser.getWelcomeText();
            assertEquals("Welcome " + userName, welcomeText);
            System.out.println(welcomeText);
            driver.close();
        } catch (NoSuchElementException e){
            fail("Text not shown");
        }catch (UnhandledAlertException e){
            fail("Login failed");
    }}

    @Then("an alert message should say login is incorrect")
    public void userGetsAlertMessageLogIncorrect() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert loginFailedAlert = driver.switchTo().alert();
            String loginFailedAlertText = loginFailedAlert.getText();
            assertEquals("Wrong password.", loginFailedAlertText);
            driver.close();
        } catch (NoAlertPresentException e) {
            fail("Alert not shown");
        }
    }
}


