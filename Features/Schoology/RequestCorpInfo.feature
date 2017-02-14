@Schoology
Feature: User is able to Request a tour as a corporation

 Scenario: Positive test case
   Given User is on home page
   And User clicks corporate link
   And User enters following information
     | FirstName         | George               |
     | LastName          | Mason                |
     | JobFunction       | Manager              |
     | Phone             | "7031234567"         |
     | EmailAddress      | gmason@gmu.edu       |
     | Company           | Globetrotters        |
     | NumberOfEmployees | 1 - 500              |
     | Country           | United States        |
     | State             | Virginia             |
     | Comments          | This is successful   |
   Then User confirms that submit button is enabled