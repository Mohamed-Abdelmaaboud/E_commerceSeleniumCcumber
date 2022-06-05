Feature: Reset Password

  Scenario: Reset Password
    Given user is on reset password page
    When user enter a valid email address
    Then an email with instructions  is sent to the user