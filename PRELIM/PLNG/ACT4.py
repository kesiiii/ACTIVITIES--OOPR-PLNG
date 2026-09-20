
print("ACTIVITY #4")
print("Please enter the prices of 2 products")
p1 = float(input("Product 1: "))
p2 = float(input("Product 2: "))
ta = p1 + p2
print(f"Total Amount: ${ta:.2f}")
while True:
    pay = float(input("Please enter your payment amount: "))
    if pay < ta:
        print("Insufficient payment. Please enter a valid amount.")
        cp = input("Do you want to continue payment? (yes/no): ").strip().lower()
        if cp == "no":
            print("Transaction cancelled. Please try again later.")
            break
        elif cp == "yes":
            continue #next iteration of the loop, starting the process again.
    else:
        print(f"Payment received: ${pay:.2f}")
        print(f"Change: ${pay - ta:.2f}")
        break #exit the loop since the payment is sufficient

