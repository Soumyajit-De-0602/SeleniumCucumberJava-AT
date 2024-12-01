@loginnew
Feature: Title of your feature
  I want to use this template for my feature file

  #Scenario:1 Dropdowns
    #Given I want to write a step with precondition
    #When some other precondition


#	Scenario:2 Alerts
    #Given Login for alerts
    #When Check various alerts
    
   #Scenario:3 Tables
    #Given Login for tables
    #When Check various tables
    
   #Scenario:4 Screenshot
    #Given Login for screenshot
    #When Take screenshot
    
    #Scenario:5 Dropdowns using login Parametres
    #Given Open URL for "DropdownURL"
    #When some other precondition
    
    Scenario:6 Alerts using login Parametres
    Given Open URL for "AlertURL"
    When Check various alerts
    
    Scenario: Execute a SQL Statement
    Given View Order details through SQL Statement
    And View Product details through SQL Statement
    
    Scenario: Close Browser and DB Connection
    And Close Browser and DB Connection
    
    
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
