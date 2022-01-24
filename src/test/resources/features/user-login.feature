Feature: User Sign in to the Demo Blaze store

  As a user I need to to Log in to the DemoBlaze store

  @test1
  Scenario Outline: User Log in with a valid username and password
    Given User have opened the Home Page
    And User have clicked on the Log in link
    When User enter <username> and <password>
    And User click on Log in button
    Then user can login
    Examples:
      | username   | password |
      | user002    | test123  |



  @test2
  Scenario Outline: User Log in with an invalid username and password
    Given User have opened the Home Page
    And User have clicked on the Log in link
    When User enter <username> and <password>
    And User click on Log in button
    Then the store should show an alert message saying login is incorrect
    Examples:
      | username   | password |
      | user006    | test123  |
      | user007    | test123  |

