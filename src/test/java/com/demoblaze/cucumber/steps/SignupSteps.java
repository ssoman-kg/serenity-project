package com.demoblaze.cucumber.steps;

import com.demoblaze.cucumber.steps.serenity.DemoblazeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class SignupSteps {

    @Steps
    DemoblazeSteps user;

    @Managed
    WebDriver driver;

    @Given("User have opened the Home Page")
    public void UserNavigateToTheHomePage() {

        user.navigateToHomePage();
    }
    @And("User have clicked on the Sign up link")
    public void UserClickOnTheSignupLink() {

        user.navigateToSignUp();
    }
    @When("User enter {userName} and {password}")
    public void UserAddUserNameAndPassword(String userName, String password) {
        user.addNewUserInfo(userName, password);
    }
    @And("User click on sign up button")
    public void UserClickOnSignUp() {
        user.signUp();
    }
    @Then("the store should show an alert message saying the user exist")
    public void UserMustBeAbleToViewTheAlertMessageSayingTheUserExist() {
        try{
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            assertEquals("This user already exist.", alertText);
        }
        catch (Exception e){
            System.out.println("Alert not Displayed");
    }

    }

    @Then("the store should show an alert message saying Sign up is successful")
    public void UserMustBeAbleToViewTheAlertMessageSayingSignUpisSuccessful() {
        try{
            Alert alert1 = driver.switchTo().alert();
            String alert1Text = alert1.getText();
            assertEquals("Sign up successful.", alert1Text);
        }
        catch (Exception e){
            System.out.println("Alert not Displayed");

        }

    }

}

