Feature: Online Mobiles Purchase site

Scenario: User Launch the url and choose a mobile phone

Given User Launch the url
When User choose a mobile phone
Then User see the nextpage

Scenario: User is going to click add to cart button

When user click add to cart buutton
And User click the cart icon

Scenario: User place the order 

When User click a place order button

Scenario: User Enter a payment details and Order a Mobile phone 

When User enter a Name
And User enter a country name
And User enter a city
And User enter a card number
And User select a card expiry month
And User select a card expiry year
And User Click a purchase button
And User Click a Ok button


