Feature: Create Account


  @TC-001
  Scenario: Validate creation of new account
    When user clicks on Sing-in link
    When user enters "abc123_test308@gmail.com" as email address
    And clicks on Create Account button
    And enter below information to creat an account
      | Title | First Name | Last Name | Password      | Day | Month | Year | Address First Name | Address Last Name | Address     | City   | State | ZipCode | Country | Mobile       | Address Alias |
      | MR    | RamuK      | Kumar     | Password99999 | 1   | 1     | 1992 | Rameshchitt        | Chittu            | Burges road | london | 1     | 12345   | 21      | 077777777777 | burges road   |
    And click on Tshirts link and feeded Tshirt link
    And click on add to cart
    And click on proceed to checkout
    And click on proceed to checout on orderpage
    And click on shipping proceed to checkout page
    And make payment
    And cllick on back to orders
    And validate the price


  @TC-002
  Scenario: Update first name in my account
    When user clicks on Sing-in link
    When user enters "abc123_test308@gmail.com" as sign-in email address
    When user enters "Password99999" as password
    When user clicks on Sign-in button
    Then update personal information and save