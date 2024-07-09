
#Sample Feature Definition Template
@tag
Feature: Login from portal
  I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes


 Background:
  Given Driver opened already.
  
  @tag2
  Scenario Outline: Positive test of Login
    Given   username <name> and  password <Password>
    When    Enter  <name> and <password>
    And     Click on <Submit>
    Then    Verifying the Message "Logged in Successfully" should display.
    
    Examples: 
      | name                    |  Password           |   URL
      | ranutiwari200@gmail.com |  Eroute@123         |  http://demoecms.s3-website.ap-south-1.amazonaws.com/#/login
     
