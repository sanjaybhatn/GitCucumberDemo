#Author: your.email@your.domain.com
Feature: Search and place the order for product

  @Searchtest
  Scenario Outline: Search experience for product search in both home and cart page
    Given User is on GreenCart landing Page
    When User searched with <prod> in Home page and extracted actual name of the product
    Then user clicks top deals link
    Then User searched with <prod> in top deals page and extracted actual name of the product
    And Validate both page searched product is matching

    Examples: 
      | prod |
      | Tom  |
      | pot  |
