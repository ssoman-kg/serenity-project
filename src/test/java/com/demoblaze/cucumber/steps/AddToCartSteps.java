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

    @Step("Verify that user is on the product page")
    public void verifyProductPage() {
    }

    @Step("Verify alert is shown saying product is added")
    public void verifyAlert() {
    }

    @Step("Navigate to the cart page")
    public void goToCartPage() {
    }

    @Step("Verify that the product is added to the cart")
    public void verifyProductAdded() {
    }

    @Step("verify products are avialble to be added on the Home page")
    public void verifyProductsAvailable() {
    }

    @Step("Click on teh product")
    public void clickProduct() {
    }

    @Step("Verify that product is added to cart")
    public void addToCart() {
    }

    @Step("Verify that new product is added to the cart")
    public void verifyNewProductAdded() {
    }

    @Step("Delete product from the cart")
    public void deleteProduct() {
    }

    @Step("Verify that product is remove from the cart")
    public void verifyProductRemoved() {
    }
}
