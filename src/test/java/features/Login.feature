Feature: Login User
  Scenario: Check Languge
    Given Open App Globedr And Check Languge
  Scenario: Login mobile successfull
    Given Login with username "chinh" and pass "123"
    And If Intro show message, I close Intro Screen to Home Page