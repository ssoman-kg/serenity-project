Feature: Log in to DemoBlaze store

  As a user I need to to Log in to the DemoBlaze store

  @test1
  Scenario Outline: Log using a valid username and password
    Given a web browser is at the DemoBlaze home page
    And the user click on the Log in link
    When the user enter a <username> and <password>
    And the user click on Log in button
    Then the user see Welcome <username>
    Examples:
      | username   | password |
      | user002    | test123  |
      | user003    | test123  |



  @test2
  Scenario Outline: Log using an invalid username and password
    Given a web browser is at the DemoBlaze home page
    And the user click on the Log in link
    When the user enter a <username> and <password>
    And the user click on Log in button
    Then alert message saying login is incorrect is shown
    Examples:
      | username   | password |
      | user006    | tes6t123  |
      | user007    | te6st123  |

