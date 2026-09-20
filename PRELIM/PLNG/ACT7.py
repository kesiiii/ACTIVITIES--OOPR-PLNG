print("ACTIVITY #7")

while True: #The entire program runs inside an infinite
    print("\nCHOICE: ")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Modulus")
    print("6. Increment X and Y")
    print("7. Decrement X and Y")

    try: #test a block of code for errors.
        choice = int(input("Enter your choice(1-7): "))
    except ValueError: #It defines a block of code that will be executed if an error occurs in the corresponding try block
        print("Invalid input. Please enter a number between 1 and 7.")
        continue

    if choice not in range(1, 8): #used to check if an element is not present in a sequence
        print("Invalid choice. Please select a number between 1 and 7.")
        continue

    try: #test a block of code for errors.
        x = float(input("Enter value for X: "))
        y = float(input("Enter value for Y: "))
    except ValueError:#receive valid input if enter a text instead of a number
        print("Invalid input. Please enter numeric values for X and Y.")
        continue

    if choice == 1:
        result = x + y
        print(f"Addition: {result:.2f}")
    elif choice == 2:
        result = x - y
        print(f"Subtraction: {result:.2f}")
    elif choice == 3:
        result = x * y
        print(f"Multiplication: {result:.2f}")
    elif choice == 4:
        if y != 0:
            result = x / y
            print(f"Division: {result:.2f}")
        else:
            print("Error: Division by zero is not allowed.")
    elif choice == 5:
        if y != 0:
            result = x % y
            print(f"Modulus: {result:.2f}")
        else:
            print("Error: Modulus by zero is not allowed.")
    elif choice == 6:
        x_in = x + 1
        y_in = y + 1
        print(f"Incremented X: {x_in:.2f}")
        print(f"Incremented Y: {y_in:.2f}")
    elif choice == 7:
        x_de = x - 1
        y_de = y - 1
        print(f"Decremented X: {x_de:.2f}")
        print(f"Decremented Y: {y_de:.2f}")

    cp = input("\nDo you want to continue? (YES/NO): ").strip().upper()
    if cp == 'NO':
        print("Program terminated. Thank you!")
        break
    elif cp == 'YES':
        continue #next iteration of the loop, starting the process again.
    else:
        print("Invalid input. Please enter YES or NO. Continuing by default.")