Feature: User adds product to the cart

  @test1
  Scenario: Play video on About us modal
    Given user is on a Product page
    When user clicks on Add to cart
    Then Alert should say added to cart
    And Product should show on cart page
    When user returns to home page
    Then other products are available on the home page
    When user clicks on a product
    Then the product page should show
    When user add the product to cart
    Then the new product should be available on the cart page
    When user deletes a product from cart page
    Then the product should not show on cart page
