Feature: feature to test login Functionality
	@Smoketest
  Scenario: Check Login Functionality with Valid Credentials
    Given User is on Login page
    When I Enter UserName and Password
    And Click on Login
    Then User Login Successful
