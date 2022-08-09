Feature: User fills contact form and sends message

  @contact
  Scenario Outline: Send message from contact form
    Given user is at the DemoBlaze landing page
    When user clicks on  Contact link
    Then contact form should open
    When user fills <email>, <name> and <message>
#    And user clicks on Send message
    Then an alert should say Thanks for the message!!
    Examples:
      | email | name    | message |
      | user  | user001 | test    |