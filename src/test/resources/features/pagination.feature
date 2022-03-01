Feature: User navigate the site using Previous and Next buttons

  @test1
  Scenario: Click on the Previous and Next buttons
    Given user is at DemoBlaze Landing page
    When user clicks on Next button
    Then the next page should show