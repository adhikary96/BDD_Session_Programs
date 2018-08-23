Feature: Login Page Validation Feature
	This feature allows the user to validate user login
	
	@test
	Scenario: User wants to login with valid details
		Given User is on the home page
		When User enters valid username and password
		Then Browser must display 'Login Successful'
	
	@test
	Scenario: User wants to login with invalid details
	
		Given User is on the home page
		When User clicks on Login without entering username
		Then Browser must display 'Username cannot be blank'
		
@test
	Scenario: User wants to login with empty details
	Given User is on the home page
		When User clicks on Login without entering password
		Then Browser must display 'Password cannot be blank'
	
		When User enters invalid username and password
		Then Browser must display 'Login Failed!!!'
		
	