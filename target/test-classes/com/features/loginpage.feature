Feature: Login Page feature

Background: 

Given User is on the log-in page

Scenario: Get the title of the page

Then User gets the "STORE" as a title 


Scenario: Login Successful

When User clicks on the login link
And a dialogue box is displayed. 
Then User enters the "admin123@yahoo.com" as an email ID 
And enters the "admin123" as a password
Then User clicks on the login Button
Then User is on the home Page


Scenario: About us and contact us present

Then after scrolling down, user can get the "We believe performance needs to be validated at every stage of the software development cycle and our open source compatible, massively scalable platform makes that a reality." as about us information 
And user get the contact information such as "2390 El Camino Real" and "+440 123456" and "demo@blazemeter.com" of the company.

Scenario: Categories option present

Then user has options like "Phones" and "Laptops" and "Monitors" to select
