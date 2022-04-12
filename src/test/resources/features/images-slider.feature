Feature: User plays slides on the Home Page

  @test1
  Scenario: Play image slide to the right
    Given user is on DemoBlaze Landing page
    When user clicks on next slide button
    Then second slide should show

  @test2
  Scenario: Play image slide to the next right
    Given user is on DemoBlaze Landing page
    When user clicks on next slide button again
    Then third slide should show

  @test3
  Scenario: Play image slide to the left
    Given user is on DemoBlaze Landing page
    When user clicks on previous slide button
    Then first slide should show

  @test4
  Scenario: lay image slide to the next left
    Given user is on DemoBlaze Landing page
    When user clicks on previous slide button again
    Then third slide should show again