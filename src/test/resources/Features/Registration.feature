Feature: Validate Registeration Page

@SanityTestAutomation_Register_By_asMaps
  Scenario Outline: Validate register page
    Given user navigate to register page
    When user click on register button and navigates to register form
    And user enter the information in below required field
      | firstname | lastname | email                   | telephone  | password  |
      | monali    | boste    | monaliboste44@gmail.com | 7743802230 | Boste@123 |
    And select the privacy and policy check box
    And click on Continue button
    Then verify user successfully create account

 @SanityTestAutomation_Register_By_asMaps_MultipleData
  Scenario Outline: Validate register page
    Given user navigate to register page
    When user click on register button and navigates to register form
    And user enter the information in below required field
      | firstname   | lastname | email                          | telephone  | password   |
      | dnyaneshwar | hiwale   | dnyaneshwarhiwale.dh@gmail.com | 9766403282 | Hiwale@123 |
      | monali      | boste    | monaliboste44@gmail.com        | 7743802230 | Boste@123  |
    And select the privacy and policy check box
    And click on Continue button
    Then verify user successfully create account

@SanityTestAutomation_Register_By_asLists_MultipleData
  Scenario Outline: Validate register page
    Given user navigate to register page
    When user click on register button and navigates to register form
    And user enter the information in below required field
      | firstname   | lastname | email                          | telephone  | password   |
      | dnyaneshwar | hiwale   | dnyaneshwarhiwale.dh@gmail.com | 9766403282 | Hiwale@123 |
      | monali      | boste    | monaliboste44@gmail.com        | 7743802230 | Boste@123  |
    And select the privacy and policy check box
    And click on Continue button
    Then verify user successfully create account