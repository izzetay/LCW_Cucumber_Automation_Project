
Feature: Search Keys Validation

  Background:
    Given User navigate to main page

  Scenario Outline: Searching a product with search input then user must see keys in the page
    Then Enter "<productName>" in search input and search
    And User must see the search page with "<productName>" header

    Examples:
      | productName |
      | Beyaz Tişört |
      | Mavi Pantolon |

  Scenario Outline: Searching incorrect words with search input then user must see 404 page
    Then Enter "<productName>" in search input and search
    Then User must see the no found page with "<productName>"
    Examples:
      | productName |
      | asdaskdmal32040 |
      | *0*090903514252 |