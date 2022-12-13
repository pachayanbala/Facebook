Feature: Create an Multiple Account

Scenario Outline: Facebook Acount
  Given User launch the browser
  When   User click on create new account
  And   User enter the first name"<firstname>"
  Then  User enter the sur name"<sname>"
  And   User enter the mail id"<mail>"
  And   User enter the password"<pass>"
  And   User enter the date of birth
  Then  User click on submit
  
Examples: 
|firstname|surname|mail|pass|
|pasupathi|pasu|pachayanb256@gmail.com|pasu@2496|  
 