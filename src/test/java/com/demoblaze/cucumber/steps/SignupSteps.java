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
    public void i_navigate_to_the_home_page() {
        user.navigateToHomePage();
    }
    @And("I click on the Sign up link")
    public void i_click_on_the_signup_link() {
        user.navigateToSignUpPage();
    }
    @And("I add user name and password")
    public void i_add_userName_and_password() {
        String userName = "user001";
        String password = "test123";
        user.addNewUserInfo(userName, password);
    }
    @And("I click on sign up")
    public void i_click_on_sign_up() {
        user.signUp();
    }
    @Then("I must be able to view the alert message saying the user exist")
    public void iMustBeAbleToViewTheAlertMessageSayingTheUserExist() {
        Alert alert = driver.switchTo().alert();
        String alertText=alert.getText();
        assertEquals("This user already exist.", alertText);
    }

    @Then("I must be able to view the alert message saying Sign up is successful")
    public void iMustBeAbleToViewTheAlertMessageSayingSignUpisSuccessful() {
        Alert alert1 = driver.switchTo().alert();
        String alert1Text= alert1.getText();
        assertEquals("Sign up successful.", alert1Text);
    }

}

