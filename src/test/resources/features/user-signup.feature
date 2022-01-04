Feature: User Sign up to the Demo Blaze store

      @test1
      Scenario Outline: As a user I need to try to Sign up as a new user to the Demo Blaze store but the user already exists
            Given I have opened the Home Page
            And I have clicked on the Sign up link
            When I enter <username> and <password>
            And I click on sign up button
            Then I must be able to view the alert message saying the user exist
            Examples:
                  | username   | password |
                  | user001    | test123  |
                  | user002    | test123  |



      @test2
      Scenario Outline: As a user I need to try to Sign up as a new user to the Demo Blaze store and user doesn't exist
            Given I have opened the Home Page
            And I have clicked on the Sign up link
            When I enter <username> and <password>
            And I click on sign up button
            Then I must be able to view the alert message saying Sign up is successful
            Examples:
                  | username   | password |
                  | user006    | test123  |
                  | user007    | test123  |



