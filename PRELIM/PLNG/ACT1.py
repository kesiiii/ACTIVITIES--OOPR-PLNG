print("ACTIVITY #1")
# 1. Input your 6 USD prices here
print("Please enter the prices of 6 products")
print(" ")
p1 = float(input("Product 1: "))

p2 = float(input("Product 2: "))

p3 = float(input("Product 3: "))

p4 = float(input("Product 4: "))

p5 = float(input("Product 5: "))

p6 = float(input("Product 6: "))

print(" ")
e = 0.87

print("Exchange Rate: 1 USD = 0.87 EUR")

print(" ")

print ("USD$ TO EURO")
print(" ") 

e1 = p1 * e
print(f"Product 1: €{e1:.2f}")
e2 = p2 * e
print(f"Product 2: €{e2:.2f}")
e3 = p3 * e
print(f"Product 3: €{e3:.2f}")
e4 = p4 * e
print(f"Product 4: €{e4:.2f}")
e5 = p5 * e
print(f"Product 5: €{e5:.2f}")
e6 = p6 * e
print(f"Product 6: €{e6:.2f}")