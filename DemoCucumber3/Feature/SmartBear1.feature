Feature: SmartBear Application

#Background: Browser Launch
#Given open the browser

@reg   
Scenario: Login in to the application
Given open the browser
When navigate to the application
|http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx|
When enter username and password
|username|password| 
|tester|test|
When click login
Then verify login is successful


@reg
Scenario: Order Submission
Given open the orders page
When Input the parameter values
|Quantity|PricePerUnit|
|5|200|
Then post the order

