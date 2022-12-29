
Feature: Search for product is Ecommerce website

@SearchProduct
  Scenario Outline: Search for a product with shortname and verify the product displayed
    Given User is on the Homepage
    When User search for item with shortname <ItemName> and verify the item displayed.
    And User navigates to topdeals page and enter the item with shortname <ItemName>
    And verify both item displayed in homepage and topdeals are same
    
    Examples:
    |ItemName|
    |Tom     |
    |Beet    |