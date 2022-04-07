Feature: User plays slides on the Home Page

  @test1
  Scenario: Play image slides
    Given user is on DemoBlaze Landing page
    When user clicks on next slide button
    Then second slide should show
    When user clicks on next slide button again
    Then third slide should show
    When user clicks on previous slide button
    Then first slide should show
    When user clicks on previous slide button again
    Then third slide should show again