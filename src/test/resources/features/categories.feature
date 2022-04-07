Feature: User navigate the site using Category links

  @test1
  Scenario: Click on the Category links
    Given user is on the DemoBlaze Landing page
    When user clicks on Categories Title
    Then the home page should refresh
    When user click on Phone Category
    Then only Phones should show
    When user click on Laptop Category
    Then only Laptops should show
    When user click on Monitor Category
    Then only Monitors should show