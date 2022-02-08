Feature: Login page feature

Scenario: Home page title
Given user is on home page
When user gets the title of the page
Then page title should be "GreenKart - veg and fruits kart"

Scenario: Free access link
Given user is on home page
Then free access link should be displayed

