Feature: Add Goods to Cart

  Scenario: Add goods to cart
    Then Click link "Zadanie 1"
    Then Enter value for "Okulary"
    Then Click button Dodaj in field "Okulary"
    Then Change value for "Kamera"
    Then Click button Dodaj in field "Kamera"
    Then Change value for "Kabel"
    Then Click button Dodaj in field "Kabel"
    Then Enter value for "Kubek"
    Then Click button Dodaj in field "Kubek"
    # Invalid amount for passing the test
#    Then Total value is "19"
    # if the amount is correct, then the test is not passed
    Then Total value is "sum"
    Then Click button Delete
    Then Total value is "0"
