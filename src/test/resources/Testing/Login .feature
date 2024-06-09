Feature: Login
Scenario: Verify the Login Page
Given Open the SauceDemo login page
When  Enter the username & password
Then  Verify the product page


Scenario: Verify the Login Page
Given Open the SauceDemo login page
When Enter the username & password
And  Add three products to the cart
When I remove one item from the cart
When Verify the cart contains two items
When Buy two items
Then Verify the order message


Scenario: Make an order within a specific price range
Given Open the SauceDemo login page
When Enter the username & password
When Add items to the cart with a total value between thirty dollar and sixty dollar
When Proceed to checkout
Then the total value of the order should be between thirty dollar and sixty dollar
