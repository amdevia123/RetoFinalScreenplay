@All
Feature: Buy a product on a technology page.

  This feature validates a purchase process on the selected web page, as well as validating the
  error when the searched product does not exist.

  @TagBuy
  Scenario: Buy a computer on the page.
    Given the user enters the page
    And he logs in andres, Pa123456
    When choose the computer that he wants to buy
    And he starts the purchase process
    Then he validates that the product to pay matches the one chosen first
    And he finishes the purchase

  @FailedBuy
  Scenario: Can't buy a computer on the page
    Given the user enters the page
    And he logs in andres, Pa123456
    When he search Mac on the page
    Then he verify that No results for "Mac"