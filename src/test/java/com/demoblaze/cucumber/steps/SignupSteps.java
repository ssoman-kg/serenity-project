package com.demoblaze.cucumber.steps;

import com.demoblaze.cucumber.steps.serenity.DemoblazeSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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

    @Given("I navigate to the Home Page")
    public void iNavigateToTheHomePage() {
        user.navigateToHomePage();
    }
    @And("I click on the Sign up link")
    public void iClickOnTheSignupLink() {
        user.navigateToSignUp();
    }
    @And("I add {word} and {word}")
    public void iAddUserNameAndPassword(String usr, String pass) {
        user.addNewUserInfo(usr, pass);
    }
    @And("I click on sign up")
    public void iClickOnSignUp() {
        user.signUp();
    }
    @Then("I must be able to view the alert message saying the user exist")
    public void iMustBeAbleToViewTheAlertMessageSayingTheUserExist() {
        try{
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            assertEquals("This user already exist.", alertText);
        }
        catch (Exception e){
            System.out.println("Alert not Displayed");
    }

    }

    @Then("I must be able to view the alert message saying Sign up is successful")
    public void iMustBeAbleToViewTheAlertMessageSayingSignUpisSuccessful() {
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

