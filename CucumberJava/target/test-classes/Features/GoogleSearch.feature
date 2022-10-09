Feature: GoogleSearch

  @Smoketest
  Scenario: Search Content from Google
    Given User is on Google Home Page
    When I Enter text in Google Search text box
    And Click on Search
    Then Records are Displayed
