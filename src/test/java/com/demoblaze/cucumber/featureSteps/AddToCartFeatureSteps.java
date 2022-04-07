package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AddToCartSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartFeatureSteps {

    @Steps
    AddToCartSteps cartUser;

    @Given("user is at the DemoBlaze Landing page")
    public void userIsAtDemoBlazeLandingPage() {
        cartUser.navigateToHomePage();
    }


    @Given("user is on a Product page")
    public void userIsOnAProductPage() {
        
    }

    @When("user clicks on Add to cart")
    public void userClicksOnAddToCart() {
        
    }

    @Then("Product should show on cart page")
    public void productShouldShowOnCartPage() {
        
    }

    @When("user returns to home page")
    public void userReturnsToHomePage() {
        
    }

    @Then("other products are avaialble on the home page")
    public void otherProductsAreAvaialbleOnTheHomePage() {
        
    }

    @When("user clicks on a product")
    public void userClicksOnAProduct() {
        
    }

    @Then("the product page should show")
    public void theProductPageShouldShow() {
        
    }

    @When("user add the product to cart")
    public void userAddTheProductToCart() {
        
    }

    @Then("the new product should be available on the cart page")
    public void theNewProductShouldBeAvailableOnTheCartPage() {
        
    }

    @When("user deletes a product from cart page")
    public void userDeletesAProductFromCartPage() {
        
    }

    @Then("the product should not show on cart page")
    public void theProductShouldNotShowOnCartPage() {
    }
}