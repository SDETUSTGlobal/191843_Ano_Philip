Feature:View all orders function
To enter in the Home page/view all orders page 
User must be able to 
Access Home page/view all orders page when login is successful 
Scenario:Clicks check all
Given User can see all the orders  
When User clicks the check all 
Then all the orders are checked
Scenario:Clicks Uncheck all
When User clicks Uncheck all 
Then all the orders are not checked
Scenario:Delete Selected
When User selects on any one of the order and clicks Delete selected
Then that order should be deleted
Scenario:Edit order
When User clicks the edit button
Then goes to selected order page