
Feature: signin

 
  Scenario Outline: user signin
    Given user open testmeapp
    And user click on signin option
    And user enter "<username>" in field
    And  enter "<password>" 
    And user clicks on login button
    And search "head" product
    Then find details of a product
    And click on addto cart button

    Examples: 
      | username  | password    |
      |lalitha    |  password123|  
