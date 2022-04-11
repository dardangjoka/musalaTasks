
@TC4 @tests
  Feature: Test Case 4

    Background: HomePage
      Given User is on the homepage

    Scenario Outline: careers printing
      When user clicks on the 'Career' link
      And clicks 'Check our open positions' button
      And Filter the available positions by available cities in the dropdown ‘Select location’ "<City>"
      And Get the open positions by city
      Then prints out the possitons.
      Examples:
      |City|
      |Sofia|
      |Skopje|
