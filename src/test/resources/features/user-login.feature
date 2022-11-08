Feature: Log in to DemoBlaze store

  @test1
  @login
  Scenario Outline: Log using a valid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <username> and <password>
    And user clicks on Log in button
    Then user should see Welcome <username>
    Examples:
      | username | password |
      | user002  | test123  |

  @test2
  @login
  Scenario Outline: Log using an valid username and invalid password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <username> and <password>
    And user clicks on Log in button
    Then an alert message should say login is incorrect
    Examples:
      | username | password |
      | user006  | test65123 |

  @test3
  @login
  Scenario Outline: Log using an invalid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <username> and <password>
    And user clicks on Log in button
    Then an alert message should say user does not exist
    Examples:
      | username | password |
      | user9006 | test6123 |
