Feature: User Navigates through different links in the Demo Blaze store

  @test1
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Home link
    Then Home page opens

  @test2
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Contact link
    Then Contact form opens

  @test3
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on About us link
    Then About us video modal opens

  @test4
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Cart link
    Then the Cart page is shown

  @test5
  Scenario Outline:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Sign in link
    Then Sign in modal opens
    And user can sign in with <username> and <password>
    Examples:
      | username | password |
      | user006  | tes6t123 |

  @test6
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Welcome link
    Then the Welcome page is shown

  @test7
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Logout link
    Then the sign in link is available to user

  @test8
  Scenario:
    Given a web browser is at the DemoBlaze landing page
    When the user click on Sign up link
    Then Sign up modal appears