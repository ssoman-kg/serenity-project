package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.LogInSteps;
import com.demoblaze.cucumber.steps.NavigationSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class NavigationFeatureSteps {

    @Steps
    NavigationSteps navigationUser;

    @Managed
    WebDriver driver;


    /**
     * Scenario 1: Home link
     */

    @Given("a web browser is at the DemoBlaze landing page")
    public void userHaveOpenedTheSite() {
        navigationUser.navigateToHomePage();
    }

    @When("the user click on Home link")
    public void UserClicksOnHomeLink() {
        navigationUser.navigateToHomeLink();
    }

    @Then("Home page opens")
    public void homePageOpens() {

    }

    /**
     * Scenario 2: Contact link
     */
    @When("the user click on Contact link")
    public void UserClicksOnContactLink() {
        navigationUser.navigateToContact();
    }

    @Then("Contact form opens")
    public void contactFormOpens() {

    }

    /**
     * Scenario 3: About us link
     */
    @When("the user click on About us link")
    public void UserClicksOnAboutUsLink() {
        navigationUser.navigateToAboutUs();
    }

    @Then("About us video modal opens")
    public void aboutUsVideoModalOpens() {

    }

    /**
     * Scenario 4: Cart link
     */
    @When("the user click on Cart link")
    public void UserClicksOnCartLink() {
        navigationUser.navigateToCart();
    }

    @Then("the Cart page is shown")
    public void userIsTakenToTheCartPage() {

    }

    /**
     * Scenario 5: Sign in link
     */
    @When("the user click on Sign in link")
    public void UserClicksOnSignInLink() {
        navigationUser.navigateTologin();
    }

    @Then("Sign in modal opens")
    public void signInModalOpens() {

    }

    @And("user can sign in with {word} and {word}")
    public void userCanSignIn(String userName, String password) { navigationUser.enterUserInfo("user001","test123");
        navigationUser.login();
    }

    /**
     * Scenario 6: Welcome link
     */
    @When("the user click on Welcome link")
    public void UserClicksOnWelcomeLink() {
        navigationUser.navigateToWelcomePage();
    }

    @Then("the Welcome page is shown")
    public void userIsTakenToTheWelcomePage() {
    }

    /**
     * Scenario 7: Logout link
     */
    @When("the user click on Logout link")
    public void UserClicksOnLogoutLink() {
        navigationUser.navigateToLogOut();
    }

    @Then("the sign in link is available to user")
    public void userIsSignedOut() {

    }

    /**
     * Scenario 8: Sign Up link
     */
    @When("the user click on Sign up link")
    public void UserClicksOnSignupLink() {
        navigationUser.navigateToSignUp();
    }

    @Then("Sign up modal appears")
    public void signUpModalAppears() {

    }
}



