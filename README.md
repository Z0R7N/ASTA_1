# ASTA_1
Test automation for portfolio

auto test in Java language using cucumber and selenide

Test case: 003

Selecting a task, filling the cart with goods, checking the number of added items, removing items from the cart, and checking the number of items in an empty cart.

1) Open page - https://buggy-testingcup.pgs-soft.com/
2) Click link - Zadanie 1
3) Add to cart item "Okulary"
4) Add to cart item "Kamera"
5) Add to cart item "Kabel"
6) Add to cart item "Kubek"
7) Check the number of items in the cart
8) Delete items from the cart
9) Check the cart is empty

Expected result: the quantity of goods matches the entered quantity

Actual result: the quantity of goods does not match the entered quantity 

# Bag Report

Severity: Critical

Author: Dmitriy Andreev

Environment: Windows 10 x64, version 20H2, Google Chrome, version 90.0.4430.72

Steps to reproduce:
1) Open page - https://buggy-testingcup.pgs-soft.com/
2) Click link - Zadanie 1
3) Add to cart item "Okulary" 2 pieces
4) Add to cart item "Kamera" 3 pieces
5) Add to cart item "Kabel" 4 pieces

Actual result: in the cart 12 pieces

Expected result: there should be 9 items in the cart
