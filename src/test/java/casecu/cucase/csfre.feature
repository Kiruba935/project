
Feature: product
  Scenario: enter login
    Given user visit to homepage
    And search for product "Head"
    When user clicks find detail button
    And click addtocarts
    Then login page displayed
    

  
   