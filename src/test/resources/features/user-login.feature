Feature: Log in to DemoBlaze store

  @test1
  Scenario Outline: Log using a valid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <username> and <password>
    And user clicks on Log in button
    Then user should see Welcome <username>
    Examples:
      | username | password |
      | user002  | test123  |
      | user003  | test123  |

  @test2
  Scenario Outline: Log using an invalid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <username> and <password>
    And user clicks on Log in button
    Then an alert message should say login is incorrect
    Examples:
      | username | password |
      | user006  | test6123 |
      | user007  | test6123 |