Feature: Retail Order Page
  ​

  Background: 
    Given User is on retail website homepage
    When User click on the login link
    And User enter email 'Guardiansbdd123@gmail.com' and password 'Guardiansbdd#123'
    And User click on login button
    Then Verify user is logged in

  
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @addItemToCartAndCheckout 
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User changes the category to 'Electronics'
    And User searches for an item 'Apex Legends'
    And User clicks Search icon
    And User clicks on item
    And User selects quantity '5'
    And User clicks add to Cart button
    Then the carts icon quantity should changed to '5'
    And User click on Cart option
    And User click on Proceed to Checkout button
    #When User click on Add a new address
    #And User fill new address form with below information
      #| country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      #| countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    #And User click Add Your Address button
    #Then a message should be displayed 'Address Added Successfully'
    And User click on Place Your Order
    Then a message should be displayed 'Order Placed Successfully'

  @cancelOrder 
  Scenario: Verify User can cancel the order
    And User clicks on Orders section
    And User clicks on first order in list
    And User click on Cancel The Order button
    And User select the cancelation Reason 'Bought wrong item'
    And User click on Cancel Order button
    Then a cancelation message should be displayed 'Your Order Has Been Cancelled'

  @returnOrder 
  Scenario: Verify User can Return the order
    And User click on Orders section
    And User click on 1st order in list
    And User click on Return Items button
    And User select the Return Reason 'Item damaged'
    And User select the drop off service 'FedEx'
    And User click on Return Order button
    Then a cancelation message should be displayed as 'Return was successful'

  @reviewOrder 
  Scenario: Verify User can write a review on order placed
    And User click on Orders sections
    And User click on the first order in list
    And User click on Review button
    And User write Review headline 'headline value' and 'review text'
    And User click Add your Review button
    Then a review message should be displayed 'Your review was added successfully'
