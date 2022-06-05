Feature: select different categories
  Scenario: logged user can Select different product categories

    Given user  log in  the website
    When user click on any product Categorie and subcategorie
    Then the product categorie and sub categorie is opened