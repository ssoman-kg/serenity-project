package com.demoblaze.cucumber.steps;

import com.demoblaze.pages.CartPage;
import com.demoblaze.pages.HomePage;
import com.demoblaze.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertEquals;

public class AddToCartSteps extends ScenarioSteps {

    CartPage cartpage;
    ProductPage productpage;
    HomePage homePage;

    /***********************************
     *
     * ADD TO CART STEPS
     /***********************************
     */

    @Step("Navigate to Home page")
    public void navigateToHomePage() {
        homePage.navigateToHomePage();
    }


    public void verifyProductRemoved() {
    }

    public void verifyNewProductAdded() {
    }

    public void verifyProductPage() {
    }

    public void addToCart() {
    }

    public void deleteProduct() {
    }

    public void verifyAlert() {
    }

    public void goToCartPage() {
    }

    public void verifyProductAdded() {
    }

    public void verifyProductsAvailable() {
    }

    public void clickProduct() {
    }
}