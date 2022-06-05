Feature: filter shoes with color

  Scenario :logged user can filter shoes with color

    Given user choose shoes color
    When user click on chosen  color
    Then  the color is chosen