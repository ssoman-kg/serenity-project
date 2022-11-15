@pagination
Feature: User navigate the site using Previous and Next buttons

Scenario: Click on the Previous and Next buttons
  Given user is at DemoBlaze Landing page
  When user clicks on Previous button
  Then the Previous page should show
  When user clicks on Next button
  Then the Next page should show
