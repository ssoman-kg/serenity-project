Feature: User fills contact form and sends message

  @test1
  Scenario: Send message from contact form
    Given user is at the DemoBlaze landing page
    When user clicks on  Contact link
    Then contact form should open
    When user fills <email>, <name> and <message>
    And user clicks on Send message
    Then an alert should say Thanks for the message!!