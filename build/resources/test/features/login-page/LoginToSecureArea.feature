Feature: Log Into Secure Area
  As a valid user
  I want to be able to login to the site
  So that I can access the secure area

  Scenario: User logs into the site using valid credentials
    Given a user is on the Login Page
    When the user logs in using valid credentials
    Then the user should see the Secure Area landing page