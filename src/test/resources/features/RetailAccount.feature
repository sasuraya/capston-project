Feature: Retail Account Page
  ​

  Background: 
    Given User is on retail website homepage
    When User click on the login link
    And User enter email 'Guardiansbdd123@gmail.com' and password 'Guardiansbdd#123'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Tamo Jan' and Phone 'phoneNumber'
    And User click on Update button
    Then user profile information should be updated

  
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | cardNumber | Tamo Jan   |              11 |           2023 |          324 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  
  Scenario: Verify User can edit Debit or Credit card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard  | expirationMonth | expirationYear | securityCode |
      | cardNumber | Tammoo John |              12 |           1013 |          321 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  
  Scenario: Verify User can remove Debit or Credit card
    And User click on remove option of card section
    Then payment details should be removed

  
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country      | fullName      | phoneNumber | streetAddress | apt      | city      | state      | zipCode      |
      | countryValue | fullnameValue | PhoneValue  | stAddress     | aptValue | cityValue | stateValue | zipCodeValue |
    And User click Add Your Address button
    Then a message should be displayed ’Address Added Successfully’

  
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user edit new address form with below information
      | country       | fullName    | phoneNumber | streetAddress | apt | city     | state    | zipCode |
      | United States | Tammoo John |  2023452344 | 211 main St   | 654 | Sterling | Virginia |   20164 |
    And User click update Your Address button
    Then a message should be displayed ’Address Updated Successfully’

  
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
