Feature: User plays video in the About us modal

  @test1
  Scenario: Play video on About us modal
    Given user is at DemoBlaze landing page
    When user clicks on About us link
    Then About us modal should open
    When user clicks on Play button on the modal
    Then the video should start playing
    When user clicks on Pause button on the video
    Then the video should stop playing