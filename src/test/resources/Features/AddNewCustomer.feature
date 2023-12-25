Feature: Add new customer

  @SanityTestAutomation_AddNewCustomer
  Scenario Outline: login with invalid email and valid password
    Given user navigate to login page
    When user enterd "<email>" and "<password>"
    And click on login button
    And click on customers hidden button
    And click on customers option
    And click on Add New button
    And enter customers information 
    And click on save button 
    Then verify new customer added successfully

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |