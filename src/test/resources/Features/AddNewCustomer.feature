Feature: Customers Page

	
  @SanityTestAutomation_AddNewCustomer
  Scenario Outline: Add New Customer
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

  @SanityTestAutomation_SearchCustomer
  Scenario Outline: Search Customer By Email or Name
    Given user navigate to login page
    When user enterd "<email>" and "<password>"
    And click on login button
    And click on customers hidden button
    And click on customers option
    Then customers webtable is display
    And find the number of table row
    And find the number of table column
    And find the virat kohali customer by name
    And retrive the all table data
    And retrive the indian cricket team customer name and customer role from table

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
