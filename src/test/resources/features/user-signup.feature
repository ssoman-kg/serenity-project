Feature: As a user I need to try to Sign up to the DemoBlaze store

@test1
Scenario Outline: User sign up as a new user to the Demo Blaze store but the user already exists
  Given User have opened the Home Page
  And User have clicked on the Sign up link
  When User enter "<userName>" and "<password>"
  And User click on sign up button
  Then the store should show an alert message saying the user exist

  Examples:
               | userName   | password |
               | user001    | test123  |
               | user002    | test123  |

@test2
Scenario Outline: User Sign up as a new user to the Demo Blaze store and user doesn't exist
  Given User have opened the Home Page
  And User have clicked on the Sign up link
  When User enter "<userName>" and "<password>"
  And User click on sign up button
  Then the store should show an alert message saying Sign up is successful

  Examples:
               | userName   | password |
               | user012    | test123  |
               | user013    | test123  |



