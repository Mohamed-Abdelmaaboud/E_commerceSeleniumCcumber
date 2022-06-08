Feature: register functionality
@Register
  Scenario: register on E-Commerce website

    Given user open the register page
    When user enter a valid email and a valid password
    Then user will be registered successfully