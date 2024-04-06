
Feature: Login Functionality
Scenario: Verify user is able to login with valid credentials

Given If user is on home page
When click on login link
And enter login details
Then verify logout link
