

Feature: Search input autocomplete test

  Scenario Outline: Check the autocomplete box is not visible after send 2 keys
    Given User navigates to website
    When Enter "<keys>" in search input
    Then User shouldn't see the autocomplete box
    Examples:
      |keys|
      |ko|


  Scenario Outline: Check the autocomplete box is visible after send 3 keys
    Given User navigate to main page
    When Enter "<keys>" in search input
    Then User should see the autocomplete box
    Examples:
      | keys |
      | kot  |