@tag
Feature: Make usuario in the application as a user
         I want to make login in the application
 
 @tag1
 Background: Given we are user
 And we enter to application 
 
  @tag1
  Scenario: Do usuario in the application
    When we make usuario with user and password
    Then the usuario is successfull
    
  @tag2
  Scenario Outline: Do usuario in the application with incorrect data
    When we make usuario with incorrect user and password
    Then the usuario is not successfull

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
