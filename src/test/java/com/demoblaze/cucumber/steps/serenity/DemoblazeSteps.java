package com.demoblaze.cucumber.steps.serenity;

import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.SignupPage;
import com.demoblaze.pages.BasePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class DemoblazeSteps extends ScenarioSteps {

    BasePage basePage;
    SignupPage signupPage;
    HomePage homePage;

    /***********************************
     *
     * BASE STEPS
     /***********************************
     */

   @Step("Navigating to Home page")
   public HomePage navigateToHomePage() { return basePage.navigateToHomePage();
   }

   @Step("Navigating to Signup Link")
    public SignupPage navigateToSignUpPage() {
        return basePage.navigateToSignUpPage();
    }

   @Step("Entering info")
    public SignupPage addNewUserInfo(String userName, String password) {
        return signupPage.addNewUserInfo(userName, password);
    }
    @Step("Clicking on Sign Up button")
    public HomePage signUp() {
        return signupPage.signUp();
    }
}

