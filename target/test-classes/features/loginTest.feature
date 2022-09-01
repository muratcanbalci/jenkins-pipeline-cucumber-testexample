Feature: All Scenario
  Scenario: Go to website and test user login
    Given navigate to Website
    And click login button
    And type email
    And click loginTwo button
    And type password
    When click on login button
    Then verify success message
