@tests
Feature: TestCase2
  Background: HomePage
    Given User is on the homepage


    @TC2
  Scenario: Verify testCase2
    When user clicks on the 'Company' link
    Then verify that the correct url is being displayed  "https://www.musala.com/company/"
    And verify that there is a "Leadership" section
    When user clicks on the FacebookLink on the footer
    Then Verify that the correct URL "https://www.facebook.com/MusalaSoft?fref=ts" loads
    And very that the Musala Soft profile picture appears on the new page

