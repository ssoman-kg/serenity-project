Feature: User Sign up to the Demo Blaze store

         As a user I need to try to Sign up to the DemoBlaze store

      @test1
      Scenario Outline: User sign up as a new user to the Demo Blaze store but the user already exists
            Given User have opened the Home Page
            And User have clicked on the Sign up link
            When User enter <username> and <password>
            And User click on sign up button
            Then the store should show an alert message saying the user exist
            Examples:
                  | username   | password |
                  | user001    | test123 |
                  | user002    | test123  |



      @test2
      Scenario Outline: User Sign up as a new user to the Demo Blaze store and user doesn't exist
            Given User have opened the Home Page
            And User have clicked on the Sign up link
            When User enter <username> and <password>
            And User click on sign up button
            Then the store should show an alert message saying Sign up is successful
            Examples:
                  | username   | password |
                  | user006    | test123  |
                  | user007    | test123  |



