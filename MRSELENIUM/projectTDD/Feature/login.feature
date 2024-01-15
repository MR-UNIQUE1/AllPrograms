Feature: Login

Scenario: Successful login with valid credential
			Given user lunch chrome browser
			When user opens url "https://admin-demo.nopcommerce.com/login"
			And user enter Email as "admin@yourstore.com" and Password as "admin"
			And click on login
			Then Page title should be  "Dashboard / nopCommerce administration"
			When user click on logout link
			Then page title should be  "Your store. Login"
			And close browser
			
			
			
Scenario Outline: Login Data Driven
			Given user lunch chrome browser
			When user opens url "https://admin-demo.nopcommerce.com/login"
			And user enter Email as "<email>" and Password as "<password>"
			And click on login
			Then Page title should be  "Dashboard / nopCommerce administration"
			When user click on logout link
			Then page title should be  "Your store. Login"
			And close browser
			
			Examples:
					| email | password |
					| admin@yourstore.com | admin |
					| admin1@yourstore.com | admin123 |
					| Sunil@YourStore.com | Mrunique |