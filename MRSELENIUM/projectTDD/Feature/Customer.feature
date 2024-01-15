Feature: Customers

Background: Bellow steps are the common for each scenario;
  		Given user lunch chrome browser
			When user opens url "https://admin-demo.nopcommerce.com/login"
			And user enter Email as "admin@yourstore.com" and Password as "admin"
			And click on login
			Then user can view Dashboad

Scenario: Add a new Customer
			When user click on customers menu
			And click on customers menu item
			And click on add new button
			Then user can view add new customer page
			When user enter customer info
			And click on save button
			Then user can view confirmation message "The new customer has been added successfully."
			And close browser
			
Scenario: Search customer by EmailID
			When user click on customers menu
			And click on customers menu item
			And Enter customer email
			When click on search buttom
			Then user should found email in the search table
			And close browser