@checkout
Feature: login to webisite and verify if the product added to cart
 
 
  Scenario Outline: login to website and verify if the product added to cart is matched
    Given User is on the Homepage
    When User search for item with shortname <ItemName> and verify the item displayed.
    And User increase the count of the item to "3"
    And User navigates to checkout page and verifies if the Apply button is displayed
    And User verifies the checkout button is displayed
    And User verify the <ItemName> added to cart is matched

    Examples: 
      |ItemName| 
      |Tom      |