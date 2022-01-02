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
   public void navigateToHomePage() {  homePage.navigateToHomePage();
   }

   @Step("Navigating to Signup Link")
    public void navigateToSignUp() {
       homePage.navigateToSignUp();
   }

   @Step("Entering info")
    public void addNewUserInfo(String userName, String password) {
         signupPage.addNewUserInfo(userName, password);
    }
    @Step("Clicking on Sign Up button")
    public void signUp() {
         signupPage.signUp();
    }
}

