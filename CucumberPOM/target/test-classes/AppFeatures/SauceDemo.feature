Feature: Sauce Demo feature

Scenario: Login Scenario
Given user is on login page
When user enters the username "standard_user" and password "secret_sauce"
Then user click login button
And home page is displayed
And user adds the highest pice product to the cart
And user checks in the cart page 