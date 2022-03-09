#Author: your.email@your.domain.com
Feature: Search and place the order for product

  @CheckoutPage  @Regreesion
  Scenario Outline: Search experience for product search in both home and cart page
    Given User is on GreenCart landing Page
    When User searched with <prod> in Home page and extracted actual name of the product
    Then Add "3" item to cart
    Then go to checkout page and validate <prod> is added to cart
    Then Verify item is added to cart
    Then Validate user has ability to enter promo code and place the order

    Examples: 
      | prod |
      | Tom  |
      | Pot  |
