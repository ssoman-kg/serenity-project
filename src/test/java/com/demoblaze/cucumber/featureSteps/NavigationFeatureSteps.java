package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.NavigationSteps;

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
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class NavigationFeatureSteps {

    @Steps
    NavigationSteps navigationUser;

    @Managed
    WebDriver driver;

    /**
     * Scenario 1: Home link
     */

    @Given("user is at DemoBlaze landing page")
    public void userHaveOpenedTheSite() {
        navigationUser.navigateToHomePage();
    }

    @When("user clicks on the Home link")
    public void UserClicksOnHomeLink() {
        navigationUser.navigateToHomeLink();
    }

    @Then("Home page should open")
    public void homePageOpens() {
        String homepageUrl = navigationUser.getUrl();
        Assert.assertEquals("https://www.demoblaze.com/index.html", homepageUrl);
        driver.close();
    }

    /**
     * Scenario 2: Contact link
     */
    @When("user clicks on the Contact link")
    public void UserClicksOnContactLink() {
        navigationUser.navigateToContact();
    }

    @Then("Contact form should open")
    public void contactFormOpens() {
        String contactModalTitle = navigationUser.findTitle();
        System.out.println(contactModalTitle);
        Assert.assertEquals("New message", contactModalTitle);
        driver.close();
    }

    /**
     * Scenario 3: About us link
     */
    @When("user clicks on the About us link")
    public void UserClicksOnAboutUsLink() {
        navigationUser.navigateToAboutUs();
    }

    @Then("About us video modal should open")
    public void aboutUsVideoModalOpens() {
        String aboutModalTitle = navigationUser.findVideoTitle();
        Assert.assertEquals("About us", aboutModalTitle);
        driver.close();
    }

    /**
     * Scenario 4: Cart link
     */
    @When("user clicks on the Cart link")
    public void UserClicksOnCartLink() {
        navigationUser.navigateToCart();
    }

    @Then("the Cart page should show")
    public void userIsTakenToTheCartPage() {
        String cartPageUrl = navigationUser.getUrl();
        Assert.assertEquals("https://www.demoblaze.com/cart.html", cartPageUrl);
        driver.close();
    }

    /**
     * Scenario 5: Sign in link
     */
    @When("user clicks on the Sign in link")
    public void UserClicksOnSignInLink() {
        navigationUser.navigateToLogin();
    }

    @Then("Sign in modal should open")
    public void signInModalOpens() {
        String loginModalTitle = navigationUser.findLoginTitle();
        Assert.assertEquals("Log in", loginModalTitle);
    }

    @And("user should be able to sign in with {word} and {word}")
    public void userCanSignIn(String userName, String password) {
        navigationUser.enterUserInfo(userName, password);
        navigationUser.login();
    }

    @And("the Welcome page should show {word}")
    public void userIsTakenToTheWelcomePage(String userName) {
        try {
            Alert loginFailedAlert = driver.switchTo().alert();
            String loginFailedAlertText = loginFailedAlert.getText();
            Assert.assertEquals("Wrong password.", loginFailedAlertText);
            fail("Login failed");
            loginFailedAlert.accept();
        } catch (NoAlertPresentException e) {
            String welcomeText = navigationUser.getWelcomeText();
            assertEquals("Welcome " + userName, welcomeText);
        }
    }

    @When("user clicks on the Logout link")
    public void UserClicksOnLogoutLink() {
        navigationUser.navigateToLogOut();
    }

    @Then("the Sign in link should be available to user")
    public void userIsSignedOut() {
        try {
            String login = navigationUser.getLoginText();
            Assert.assertEquals("Log in", login);
            driver.close();
        } catch (NoSuchElementException e) {
            fail("Text not shown");
        }
    }

    /**
     * Scenario 6: Sign Up link
     */
    @When("user clicks on Sign up link")
    public void UserClicksOnSignupLink() {
        navigationUser.navigateToSignUp();
    }

    @Then("the Sign up modal should appear")
    public void signUpModalAppears() {
        String signUpModalTitle = navigationUser.getSignUpTitle();
        Assert.assertEquals("Sign up", signUpModalTitle);
        driver.close();
    }
}