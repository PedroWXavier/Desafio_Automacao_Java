Feature: Saucedemo

  Scenario: Buying a product at demoblaze
    Given that I access demoblaze site
    And I create an account
    And I do my login
    When I add a monitor to my cart
    And I complete the payment
    Then I should validate my purchase