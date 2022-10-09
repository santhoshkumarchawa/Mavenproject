Feature: Cargotechniques Login Functionality

  @Smoketest
  Scenario: Login Successfull with Valid Credentials
    Given User is on HomePage
    When I Enter Valid UserName and Password
    And Click on LogOn
    Then User is Logged in Successfully