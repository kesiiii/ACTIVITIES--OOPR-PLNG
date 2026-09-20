print("ACTIVITY #6")
while True:#The entire program runs inside an infinite
    print("\nEnter Java Programming Score: ")
    java = float(input())
    print(f"Java Programming Score: {java}")
    print(" ")
    print("Enter C Programming Score: ")
    c = float(input())
    print(f"C Programming Score: {c}")
    print(" ")
    print("Enter Database Handling Score: ")
    dhs = float(input())
    print(f"Database Handling Score: {dhs}")
    print(" ")

    avg = (c + java + dhs) / 3
    print(f"Average Score: {avg:.2f}")

    if avg < 0 or avg > 100:
        print("Invalid Output")
    elif avg < 75:
        print("Grade: F")
    elif avg <= 79:
        print("Grade: C")
    elif avg <= 89:
        print("Grade: B")
    elif avg <= 100:
        print("Grade: A")

    cp = input("\nDo you want to continue? (YES/NO): ").strip().upper()
    if cp == 'NO':
        print("Program terminated. Thank you!")
        break
    elif cp == 'YES':
        continue #next iteration of the loop, starting the process again.
    else:
        print("Invalid input. Please enter YES or NO. Continuing by default.")