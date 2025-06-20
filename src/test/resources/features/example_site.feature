Feature: Example.com homepage

  @P1
  Scenario: User visits example.com and sees the correct text
    Given I am on the Example.com homepage
    Then I should see "Example Domain" in the page title