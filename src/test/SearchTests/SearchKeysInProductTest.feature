

Feature: Search Keys In Products Test

  Background:
    Given User navigate to main page

  Scenario Outline: Validate the searched keys in product names
    When Enter "<productName>" in search input
    And User must see the search page with "<productName>" header
    Then User must see "<productName>" in products 10 at least

    Examples:
      |productName|
      |hırka|
      |gömlek|