Feature: user registeration
  Scenario: registration process
    Given user enters to TestMeApp
    And click on signup
    When user enters username "<Lalitha>" in the field
    And user enters first name as "<kiruba>"
    And user enters last name as "<kumar>"
    Then user enters password as "<password123>"
    And user confirms the password as "<password123>"
    And user enters gender "<female>"
    And enters email as "<kiruba@gmail.com>"
    And enters DOB "<09/13/1997>"
    And enters address as "<371,rathinam nagar,pathiri,cuddalore>"
    And enters security question
    And enters answer "<cuddalore>"
    Then user clicks the register button
    