Feature: NMKT NYC Online Login
  As a user of NMKTNYC i can login to online store 
  SO i can do all logged in activities.
  
  Scenario: Successfull Login
  Given I open browser chrome
  And I navigate to socialware.com
  When I complete login with valid credentials
  Then I expect profile Name as  James Methow
	
