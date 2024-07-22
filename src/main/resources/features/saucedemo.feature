Feature: Saucedemo

  Scenario: Loggin in saucedemo
    Given I access saucedemo site
    When I fill login and password
    And I press the login button
    Then I should be logged in