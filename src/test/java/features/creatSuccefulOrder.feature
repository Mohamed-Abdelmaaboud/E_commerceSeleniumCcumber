Feature: create successful order
  Scenario: create successful order

    Given user go to shopping cart
    When user click on checkout
    And filling out billing address
    And choose the address
    And choose the payment method
    And confirm order
    Then the product is ordered successfully