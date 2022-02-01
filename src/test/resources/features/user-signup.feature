Feature: Sign up to the DemoBlaze store

@test1
Scenario Outline: Sign up as a new user to the Demo Blaze store but the user already exists
  Given a web browser is at theDemoBlaze home page
  And the user click on the Sign up link
  When the user enter "<userName>" and "<password>"
  And the user click on sign up button
  Then an alert message saying the user exist is shown

  Examples:
               | userName   | password |
               | user001    | test123  |
               | user002    | test123  |

@test2
Scenario Outline: Sign up as a new user to the Demo Blaze store and user doesn't exist
  Given a web browser is at theDemoBlaze home page
  And the user click on the Sign up link
  When the user enter "<userName>" and "<password>"
  And the user click on sign up button
  Then an alert message saying Sign up is successful is shown

  Examples:
               | userName   | password |
               | user012    | test123  |
               | user013    | test123  |



