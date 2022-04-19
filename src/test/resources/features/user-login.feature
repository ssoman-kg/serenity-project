Feature: Log in to DemoBlaze store

  @test1
  Scenario: Log using a valid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <validUsername> and <validPassword>
    And user clicks on Log in button
    Then user should see Welcome <validUsername>


  @test2
  Scenario: Log using an valid username and invalid password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <validUsername> and <invalidPassword>
    And user clicks on Log in button
    Then an alert message should say login is incorrect

  @test3
  Scenario: Log using an invalid username and password
    Given user is at the DemoBlaze home page
    And user clicks on the Log in link
    When user enters <invalidUsername> and <password>
    And user clicks on Log in button
    Then an alert message should say user does not exist