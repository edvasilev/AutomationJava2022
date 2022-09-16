Feature: Delete customer

  Scenario: User deletes customer
    Given User is logged in
    When User selects 'Customers'
    And User clicks 'Delete'
    Then A customer is deleted

