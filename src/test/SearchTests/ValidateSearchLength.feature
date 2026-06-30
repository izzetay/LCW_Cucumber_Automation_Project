
Feature: Validate search length

  Scenario Outline:
    Given User navigates to website
    When Enter "<productName>" in search input and search
    And User must see the search page with "<productName>" header
    Then Product size must be same with search page info

    Examples:
      | productName |
      | Ütü        |