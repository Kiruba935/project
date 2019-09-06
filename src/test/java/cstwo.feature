
@tag
Feature: signin

   @tag2
  Scenario Outline: user signin
    Given user click on signin button
    And user enters "<username>" 
    And user enter "<password>" 
    When user click on login button
    Then home page gets displayed

    Examples: 
      | username  | password    |
      |lalitha    |  password123|