Feature: Sign up to the DemoBlaze store

  @test1
  Scenario Outline: Sign up as a new user to the Demo Blaze store but the user already exists
    Given user is at DemoBlaze home page
    And user clicks on the Sign up link
    When user enters the "<userName>" and "<password>"
    And user clicks on Sign up button
    Then an alert message should say the user already exist
    Examples:
      | userName | password |
      | user001  | test123  |
      | user002  | test123  |

  @test2
  Scenario Outline: Sign up as a new user to the Demo Blaze store and user doesn't exist
    Given user is at DemoBlaze home page
    And user clicks on the Sign up link
    When user enters the "<userName>" and "<password>"
    And user clicks on Sign up button
    Then an alert message should say Sign up is successful
    Examples:
      | userName | password |
      | user_33  | test123  |
      | user_34 | test123  |