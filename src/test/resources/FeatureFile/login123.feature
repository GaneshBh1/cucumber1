Feature:Login testing
Scenario Outline:worong password
Given open login page
When enter "<name1>" and "<Pass1>"
Then click login
And Show "<warning>"



Examples:
|name1|Pass1|warning|
|123@yahoo.com|dea|Your email or password is incorrect!|


