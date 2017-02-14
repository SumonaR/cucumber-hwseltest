@TC005
Feature: User is able to Signup as a student using given access code

  Scenario: Positive test case
    Given User is on schoologyhome page
    When User clicks on signup link
    And User clicks on Student link
    And User Enters code
      | access code | 66HDP-N2H84 |
    And User clicks on continue button
    And User completes form in following order
      | FirstName       | George         |
      | LastName        | Mason          |
      | EmailAddress    | gmason@gmu.edu |
      | Password        | gmu1234        |
      | ConfirmPassword | gmu1234        |
    And User selects Date of birth in following order
      | Month | June |
      | Day   |   15 |
      | Year  | 1920 |
    And User confirms that periodic schoology updates option is checked
    Then User made sure that Registeration button is Enabled
