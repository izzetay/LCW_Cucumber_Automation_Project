

  Feature: Search Key Test
    Scenario Outline: User search keys, these keys must be in the product page
      Given User navigate to main page
      When Enter "<productName>" in search input and press enter
      And Click to a product in search page and navigate to product page
      Then User be able to see "Kolsuz" and "Tişört" in the product description
      Examples:
        |productName|
        |Kolsuz Tişört|