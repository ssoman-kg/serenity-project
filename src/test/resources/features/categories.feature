Feature: User navigate the site using Category links

  @test1
  @categories
  Scenario: Click on the Category link
    Given user is on the DemoBlaze Landing page
    When user clicks on Categories Title
    Then the home page should refresh

  @test2
  @phones
  @categories
  Scenario: Click on the Phone Category
    Given user is on the DemoBlaze Landing page
    When user click on Phone Category
    Then only Phones should show

  @test3
  @laptops
  @categories
  Scenario: Click on the Laptop Category
    Given user is on the DemoBlaze Landing page
    When user click on Laptop Category
    Then only Laptops should show

  @test4
  @monitors
  @categories
  Scenario: Click on the Monitor Category
    Given user is on the DemoBlaze Landing page
    When user click on Monitor Category
    Then only Monitors should show