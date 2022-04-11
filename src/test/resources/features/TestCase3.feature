

@tests
Feature: Testcase 3

  Background: HomePage
      Given User is on the homepage
    @TC3
  Scenario: careers
        When user clicks on the 'Career' link
        And clicks 'Check our open positions' button
        Then Verify that ‘Join Us’ page is opened "https://www.musala.com/careers/join-us/"
        And From the dropdown ‘Select location’ select ‘Anywhere’
        And  Choose open position by name (e.g. "Experienced Automation QA Engineer")
        Then Verify that 4 main sections are shown: "General description", "Requirements", "Responsibilities", "What we offer"
        And erify that ‘Apply’ button is present at the bottom
        Then Click ‘Apply’ button
        And send
              |name | email |
              |email| das@da|
        And Upload cv document and click send
        Then very that error message is showing

