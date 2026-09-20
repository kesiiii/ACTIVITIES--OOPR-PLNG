print("ACTIVITY #3")
try:
    x = int(input("Please enter a multiple of 5 between 1 and 100: "))
    m5 = (x % 5 == 0)
    r = (1 <= x <= 100)

    if m5 and r:
        print(f"The number {x} is valid. It is a multiple of 5 and is between 1 and 100.")
    else:
        if not m5:
            print(f"The number {x} is invalid. It is not a multiple of 5.")
        if not r:
            print(f"The number {x} is invalid. It is not between 1 and 100.")

except ValueError:
    print("Invalid input. Please enter an integer.")