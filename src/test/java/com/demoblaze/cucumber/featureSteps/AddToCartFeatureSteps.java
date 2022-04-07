package com.demoblaze.cucumber.featureSteps;

import com.demoblaze.cucumber.steps.AddToCartSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AddToCartFeatureSteps {

    @Steps
    AddToCartSteps cartUser;

    @Given("user is on a Product page")
    public void userIsOnAProductPage() {
        cartUser.verifyProductPage();
    }

    @When("user clicks on Add to cart")
    public void userClicksOnAddToCart() {
        cartUser.addToCart();
    }

    @Then("Alert should say added to cart")
    public void alertShouldSayAddedToCart() {
        cartUser.verifyAlert();
    }

    @Then("Product should show on cart page")
    public void productShouldShowOnCartPage() {
        cartUser.goToCartPage();
        cartUser.verifyProductAdded();
    }

    @When("user returns to home page")
    public void userReturnsToHomePage() {
        cartUser.navigateToHomePage();
    }

    @Then("other products are available on the home page")
    public void otherProductsAreAvailableOnTheHomePage() {
        cartUser.verifyProductsAvailable();
    }

    @When("user clicks on a product")
    public void userClicksOnAProduct() {
        cartUser.clickProduct();
    }

    @Then("the product page should show")
    public void theProductPageShouldShow() {
        cartUser.verifyProductPage();
    }

    @When("user add the product to cart")
    public void userAddTheProductToCart() {
        cartUser.addToCart();
    }

    @Then("the new product should be available on the cart page")
    public void theNewProductShouldBeAvailableOnTheCartPage() {
        cartUser.verifyNewProductAdded();
    }

    @When("user deletes a product from cart page")
    public void userDeletesAProductFromCartPage() {
        cartUser.deleteProduct();
    }

    @Then("the product should not show on cart page")
    public void theProductShouldNotShowOnCartPage() {
        cartUser.verifyProductRemoved();
    }
}