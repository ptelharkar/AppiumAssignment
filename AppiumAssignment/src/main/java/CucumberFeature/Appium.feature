
Feature: Title of your feature

  Scenario: Check Timer
    Given I Launch API Demos Application
    When I click on Views
    And click on Chronometer
    Then Chronometer page is displayed
    Then Check Timer
    And click on Start button
    Then Check for Timer
    And Click on Stop button
    Then Click on Reset button
    Then close the driver

 Scenario: Checkbox and Radio button Selection
   Given I Launch API Demos Application
    When I click on Views
    And click on Controls
    And click on Holo or Old Theme
    Then select Checkbox
    And verify that Checkbox is selected
    Then select radio button
    And verify that Radio button is selected
		Then close the driver
		
	Scenario: Check Date
   Given I Launch API Demos Application
    When I click on Views
    And click on Date Widgets
    And click on Dialog
    Then Check the date
    Then change the date
    And verify the changed date
    Then close the driver
  
  Scenario: Check Expandable List
   Given I Launch API Demos Application
    When I click on Views
    And click on Expandable Lists
    And click on Custom Adapter
    Then Check Expandable Items
    Then close the driver
    
  
    
Scenario: Check Tabs
   Given I Launch API Demos Application
    When I click on Views
    And click on Tabs
    And click on Content By Factory
    Then Select diffrent tabs and validate text
    Then close the driver