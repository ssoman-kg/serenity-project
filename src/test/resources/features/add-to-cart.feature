Feature: User adds product to the cart

  @test1
  Scenario: Add first product to the cart
    Given user is on a Product page
    When user clicks on Add to cart
    Then Alert should say added to cart
    And Product should show on cart page

  @test2
  Scenario: Play video on About us modal
    Given user returns to home page
    Then other products are available on the home page
    When user clicks on a product
    Then the product page should show
    When user add the product to cart
    Then the new product should be available on the cart page


  @test3
  Scenario: Deleting product from the cart
    Given user is on the Cart page
    When user deletes a product from cart page
    Then the product should not show on cart page