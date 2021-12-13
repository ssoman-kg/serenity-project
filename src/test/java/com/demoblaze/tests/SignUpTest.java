package com.demoblaze.tests;

import com.demoblaze.steps.serenity.DemoblazeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

@RunWith(SerenityRunner.class)
public class SignUpTest {

    @Managed
    WebDriver driver;

    @Steps
    DemoblazeSteps user;

    @Test
    @Title("Add a new user to store")

    public void addNewUserToDemoBlaze() throws InterruptedException {
        String userName = "user001";
        String password = "test123";


        user.openStore();
        user.navigateToSignUpLink();
        user.addNewUserInfo(userName, password);
        user.clickSignUp();
        Alert alert = driver.switchTo().alert();
        String alertText=alert.getText();

        assertEquals("This user already exist.", alertText);

    }
}

