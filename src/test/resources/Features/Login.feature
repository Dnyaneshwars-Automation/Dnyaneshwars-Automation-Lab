Feature: Validate Login Page

@SanityTestAutomation_Login
  Scenario Outline: login with invalid email and valid password
    Given user navigate to login page
    When user enterd "<Email>" and "<Password>"
    And click on login button
    Then user validate error message with invalid email

    Examples: 
      | Email                       | Password   |
      | dnyaneshwarhiwale@gmail.com | Hiwale@123 |

  @SanityTestAutomation_Login
  Scenario Outline: login with valid email and invalid password
    Given user navigate to login page
    When user enterd "<Email>" and "<Password>"
    And click on login button
    Then user validate error message with invalid password

    Examples: 
      | Email                          | Password   |
      | dnyaneshwarhiwale.dh@gmail.com | hiwale@123 |