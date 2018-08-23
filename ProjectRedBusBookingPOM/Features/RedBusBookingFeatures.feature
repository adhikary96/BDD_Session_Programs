Feature: RedBus Booking Feature
	This featre helps the user to search for a bus from one location to other  for a particular day
	
@Bus
Scenario: User wants to search for buses available inbetween two locations on a particular day
	Given 	User is on the home page of RedBus
	When 	User enters valid source and destination locations
	Then 	Browser displays the available buses
	