Feature: Search functionality

  Scenario: logged user can search for a product

    Given user is logged in
    When user enter a product in search field and click on search button
    Then search product will appear