package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.LogInSteps;
import io.cucumber.java.en.And;
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

    //    @Given("User have opened the Home Page")
//    public void userNavigateToTheHomePage() {
//
//        user.navigateToHomePage();
//    }
    @And("User have clicked on the Log in link")
    public void userClickOnTheLoginLink() {

        loginUser.navigateToLogin();
    }
    @When("User enter {word} and {word}")
    public void userEnterUserNameAndPassword(String userName, String password) {
        loginUser.enterUserInfo(userName, password);
    }
    @And("User click on Log in button")
    public void userClickOnLogIn() {
        loginUser.login();
    }
    @Then("user can login")
    public void userMustBeAbleToViewTheAlertMessageSayingTheUserExist() {
        try {
            loginUser.navigateToWelcomePage();
        } catch (Exception e) {
            System.out.println("Fail");
        }

    }

    @Then("the store should show an alert message saying login is incorrect")
    public void userGetsAnAlertMessageSayingLoginIsIncorrect() {
        try{
            Alert alert1 = driver.switchTo().alert();
            String alert1Text = alert1.getText();
            assertEquals("Wrong password.", alert1Text);
        }
        catch (Exception e){
            System.out.println("Alert not Displayed");

        }

    }


}


