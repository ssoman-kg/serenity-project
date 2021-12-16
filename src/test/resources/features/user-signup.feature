Feature: User Sign up to the Demo Blaze store

      Scenario: As a user I need to try to Sign up as a new user to the Demo Blaze store but the user already exists
            Given I navigate to the Home Page
            And I click on the Sign up link
            And I add user name and password
            And I click on sign up
            Then I must be able to view the alert message saying the user exist


