Feature: User Navigates through different links in the Demo Blaze store

  @test1
  @navigation
  Scenario: Navigate to Home page
    Given user is at DemoBlaze landing page
    When user clicks on the Home link
    Then Home page should open

  @test2
  @navigation
  Scenario: Navigate to Contact page
    Given user is at DemoBlaze landing page
    When user clicks on the Contact link
    Then Contact form should open

  @test3
  @navigation
  Scenario: Navigate to About us page
    Given user is at DemoBlaze landing page
    When user clicks on the About us link
    Then About us video modal should open

  @test4
  @navigation
  Scenario: Navigate to Cart page
    Given user is at DemoBlaze landing page
    When user clicks on the Cart link
    Then the Cart page should show

  @test4
  @navigation
  Scenario Outline: Navigate to Sign in page and can logout
    Given user is at DemoBlaze landing page
    When user clicks on the Sign in link
    Then Sign in modal should open
    And user should be able to sign in with <username> and <password>
    And the Welcome page should show <username>
    When user clicks on the Logout link
    Then the Sign in link should be available to user
    Examples:
      | username | password |
      | user006  | test123  |

  @test6
  @navigation
  Scenario: Navigate to Sign up page
    Given user is at DemoBlaze landing page
    When user clicks on Sign up link
    Then the Sign up modal should appear