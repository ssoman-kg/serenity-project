Feature: User plays video in the About us modal

  @test1
  Scenario: Play video on About us modal
    Given user is at the DemoBlaze Landing page
    When user clicks on About us link
    Then About us modal should open
