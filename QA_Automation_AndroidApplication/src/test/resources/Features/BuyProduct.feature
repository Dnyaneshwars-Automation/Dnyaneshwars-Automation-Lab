@tag
Feature: Buy Samsung S22 on Amezon Application

  @AmezonIndia
  Scenario Outline: Validate for buy product on amezon app
    Given user navigate on home screen
    When click on search and enter "<Product>"
    And click on our product
    And click on Buy Now button
    And select address and click on Continue button
    And select payment method and click on Continue button
    Then click on Place Your Order and Pay buuton
    
    Examples: 
  | SheetName | RowNum | ColNum |
  | TestData   | 1      | 0      |
