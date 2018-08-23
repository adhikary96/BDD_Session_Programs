Feature: Login Page Validation Feature
	This feature allows the user to validate user login
	
	@test
	Scenario: User wants to login with empty username
		Given User is on the home page
		When User clicks on Login without entering username
		Then Browser must display 'Username cannot be blank'
		
@test
Scenario: User wants to login with empty username
		Given User is on the home page
		When User clicks on Login without entering password
		Then Browser must display 'Password cannot be blank'
	
	@test
	Scenario: User wants to login using valid details
		Given User is on the home page
		When User enters valid username and password
		Then Browser must display 'Login Successful'
		
	@test
	Scenario: User wants to login using invalid details
		Given User is on the home page
		When User enters invalid username and password
		Then Browser must display 'Login Failed!!!'
		
	