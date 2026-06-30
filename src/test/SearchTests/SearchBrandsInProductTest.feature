

Feature: Search Keys In Products Test

  Background:
    Given User navigate to main page

  Scenario Outline: Validate the searched keys in brand names
    When Enter "<brandName>" in search input
    And User must see the search page with "<brandName>" header
    Then User must see "<brandName>" in products brands 10 at least

    Examples:
      |brandName|
      |Puma|
