print("ACTIVITY #5")
while True:
    x = str(input("Enter First Word: "))
    y = str(input("Enter Second Word: "))
    z = str(input("Enter Third Word: "))
    x, y, z = x.upper(), y.upper(), z.upper()
    x, y, z = sorted([x, y, z])
    print(x, y, z)
    c = input("\nDo you want to continue? (YES/NO): ").strip().upper()
    if c == 'NO':
        print("Program terminated. Thank you!")
        break
    elif c == 'YES':
        continue #next iteration of the loop, starting the process again.
    else:
        print("Invalid input. Please enter YES or NO. Continuing by default.")