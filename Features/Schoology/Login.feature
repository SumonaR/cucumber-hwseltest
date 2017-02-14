@TC006
Feature: As a registered user, I want to enroll in anther course.

  Scenario: Positive test case
    Given User is on home page of schoology
    When User clicks logins in link
    And User enters Login Information
      | username | ant.vanegas@yahoo.com |
      | password | 123Class              |
    And User clicks log in button
    And User clicks Courses tab
    And User clicks join button in dropdown
    And User Enters code in SchoologyDashboardPage
      | access code | 66HDP-N2H84 |
    Then User clicks blue join button
