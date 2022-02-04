package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.LogInSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class LogInFeatureSteps {

    @Steps
    LogInSteps loginUser;

    @Managed
    WebDriver driver;

    @Given("a web browser is at the DemoBlaze home page")
    public void webBrowserAtHomePage() {
        loginUser.navigateToHomePage();
    }

    @And("the user click on the Log in link")
    public void userClickOnTheLoginLink() {
        loginUser.navigateToLogin();
    }

    @When("the user enter a {word} and {word}")
    public void userEnterUserNameAndPassword(String userName, String password) {
        loginUser.enterUserInfo(userName, password);
    }

    @And("the user click on Log in button")
    public void userClickOnLogIn() {
        loginUser.login();
    }

    @Then("the user see Welcome {word}")
    public void UserSeeWelcomeUsername(String userName) {
        try {
            String text = loginUser.getWelcomeText();
            assertEquals("Welcome " + userName, text);
            System.out.println(text);
        } catch (Exception e) {
            System.out.println("Fail");
        }
    }

    @Then("alert message saying login is incorrect is shown")
    public void userGetsAlertMessageLoginIncorrect() {
        try {
            Thread.sleep(5000);
            Alert alert1 = driver.switchTo().alert();
            String alert1Text = alert1.getText();
            assertEquals("Wrong password.", alert1Text);
        } catch (Exception e) {
            System.out.println("Alert not Displayed");
        }
    }
}


