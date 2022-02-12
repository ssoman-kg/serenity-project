package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.NavigationSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        System.out.println("test");
        System.out.println(homepageUrl);
        //Assert.assertTrue(homepageUrl.contains("https://www.demoblaze.com/index.html]"));
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
        System.out.println(aboutModalTitle);
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
        //Assert.assertTrue(cartPageUrl.contains("https://www.demoblaze.com/cart.html"));
        System.out.println(cartPageUrl);
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
    public void signInModalOpens() {navigationUser.getUrl();
        String loginModalTitle = navigationUser.findLoginTitle();
        System.out.println(loginModalTitle);
        Assert.assertEquals("Log in", loginModalTitle);
    }

    @And("user should be able to sign in with {word} and {word}")
    public void userCanSignIn(String userName, String password) {
        navigationUser.enterUserInfo(userName, password);
        navigationUser.login();
    }

    @When("user clicks on the Welcome link")
    public void UserClicksOnWelcomeLink() {
        navigationUser.navigateToWelcomePage();
    }

    @Then("the Welcome page should show {word}")
    public void userIsTakenToTheWelcomePage(String userName) {
        try {
            String welcomeText = navigationUser.getWelcomeText();
            assertEquals("Welcome " + userName, welcomeText);
            System.out.println(welcomeText);
        } catch (NoSuchElementException e){
            fail("Text not shown");
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
            System.out.println(login);
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
        System.out.println(signUpModalTitle);
        Assert.assertEquals("Sign up", signUpModalTitle);
        driver.close();

    }
}



