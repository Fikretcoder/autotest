Feature: Login feature

  Scenario: Successful Login

    Given the app is launched
    When  I tap on the not now button
    And   I tap on the accept all button
    And   I tap on the login
    And   Write username "user"
    And   Write password "admin"
    And   I tap on the enter
    Then  procedure is over





