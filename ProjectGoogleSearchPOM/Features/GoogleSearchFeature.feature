Feature: Google Search Feature
	Using this feature user can search for various information
	
@google
	Scenario: User wants to search information about 'Agile Methodology' by entering valid set of words
	Given User is on Google home page
	When 	User searches for 'Agile Methodology' term
	Then 	All page links should be displayed for 'Agile Methodology'
	