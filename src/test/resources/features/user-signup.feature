Feature: Sign up to the DemoBlaze store

  @test1
  @signup
  Scenario Outline: Sign up as a new user to the Demo Blaze store but the user already exists
    Given user is at DemoBlaze home page
    And user clicks on the Sign up link
    When user enters the <userName> and <password>
    And user clicks on Sign up button
    Then an alert message should say the user already exist
    Examples:
      | userName | password |
      | user001  | test123  |

<<<<<<< HEAD
#  @test2
#  @signup
#  Scenario Outline: Sign up as a new user to the Demo Blaze store and user doesn't exist
#    Given user is at DemoBlaze home page
#    And user clicks on the Sign up link
#    When user enters the <userName> and <password>
#    And user clicks on Sign up button
#    Then an alert message should say Sign up is successful
#    Examples:
#      | userName    | password |
#      | newuser     | test123  |
=======
  @test2
  @signup
  Scenario Outline: Sign up as a new user to the Demo Blaze store and user doesn't exist
    Given user is at DemoBlaze home page
    And user clicks on the Sign up link
    When user enters the <userName> and <password>
    And user clicks on Sign up button
    Then an alert message should say Sign up is successful
    Examples:
      | userName    | password |
      | newuser_63  | test123  |
>>>>>>> 8295e7e5ab1c48a7177e7246cf7b3dab1a7d073f
