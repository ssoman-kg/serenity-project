package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.BaseSteps;
import com.demoblaze.cucumber.steps.NavigationSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NavigationFeatureSteps {

    @Steps
    NavigationSteps navigationUser;
    BaseSteps baseUser;

    /**
     * Scenario 1: Home link
     */
    @Given("user is at DemoBlaze landing page")
    public void userHaveOpenedTheSite() {
        baseUser.navigateToHomePage();
    }

    @When("user clicks on the Home link")
    public void UserClicksOnHomeLink() {
        navigationUser.navigateToHomeLink();
    }

    @Then("Home page should open")
    public void homePageOpens() {
        navigationUser.verifyHomePageOpen();
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
        navigationUser.verifyContactForm();
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
        navigationUser.verifyAboutUs();
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
        navigationUser.verifyCartPage();
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
        navigationUser.verifySignInModalTitle();
    }

    @And("user should be able to sign in with {word} and {word}")
    public void userCanSignIn(String userName, String password) {
        navigationUser.enterUserInfo(userName, password);
        navigationUser.login();
    }

    @And("the Welcome page should show {word}")
    public void userIsTakenToTheWelcomePage(String userName) {
        navigationUser.verifyWelcomeText(userName);
    }

    @When("user clicks on the Logout link")
    public void UserClicksOnLogoutLink() {
        navigationUser.navigateToLogOut();
    }

    @Then("the Sign in link should be available to user")
    public void userIsSignedOut() {
        navigationUser.verifySignedOut();
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
        navigationUser.verifySignUpModal();
    }
}