def program1():
    numbers = []

    print("\nPROGRAM 1")
    print("Enter 10 real numbers:")

    for i in range(10):
        number = float(input(f"Number {i + 1}: "))
        numbers.append(number)

    total = 0
    positive_count = 0

    for number in numbers:
        if number > 0:
            total += number
            positive_count += 1

    average = total / positive_count if positive_count > 0 else 0

    print("\nSum of positive numbers:", total)
    print("Average of positive numbers:", average)

    negative_count = 0

    for number in numbers:
        if number < 0:
            negative_count += 1

    print("Number of negative numbers:", negative_count)

    minimum = numbers[0]

    for number in numbers[1:]:
        if number < minimum:
            minimum = number

    print("Minimum value:", minimum)


def program2():
    numbers = []

    print("\nPROGRAM 2")
    print("Enter 8 integer numbers:")

    for i in range(8):
        number = int(input(f"Number {i + 1}: "))
        numbers.append(number)

    unique = []

    for number in numbers:
        if number not in unique:
            unique.append(number)

    print("\nArray after removing duplicates:", *unique)

    if len(unique) < 2:
        print("Second largest element: Not available")
        print("Second smallest element: Not available")
        return

    # Sort the unique numbers
    sorted_numbers = sorted(unique)

    second_smallest = sorted_numbers[1]
    second_largest = sorted_numbers[-2]

    print("Second largest element:", second_largest)
    print("Second smallest element:", second_smallest)


def program3():
    print("\nPROGRAM 3")

    data = input("Enter Data in Array: ")

    parts = data.strip().split()
    numbers = []

    for part in parts:
        numbers.append(int(part))

    print("Stored Data in Array:", *numbers)

    position = int(input("Enter poss. of Element to Delete: "))

    if position < 1 or position > len(numbers):
        print("Invalid position.")
        return

    # Delete the element at the given position
    new_array = []

    for i in range(len(numbers)):
        if i != position - 1:
            new_array.append(numbers[i])

    print("New data in Array:", *new_array)


def program4():
    print("\nPROGRAM 4")

    size = int(input("Enter Size of Array: "))

    numbers = []

    print(f"Enter any {size} elements in Array:")

    for i in range(size):
        numbers.append(int(input()))

    print("\nEven Elements:", end=" ")

    for number in numbers:
        if number % 2 == 0:
            print(number, end=" ")

    print("\nOdd Elements:", end=" ")

    for number in numbers:
        if number % 2 != 0:
            print(number, end=" ")

    print()


def program5():
    print("\nPROGRAM 5")

    rows = 4

    for i in range(1, rows + 1):
        for j in range(1, i + 1):
            print("*", end="")

            # Print A after every asterisk except the last one
            if j < i:
                print("A", end="")

        print()

def program6():
    print("\nPROGRAM 6")

    bs = input("Enter Basic Salary: ")
    bs = float(bs)
    da = bs * 0.12
    hra = input("Enter HRA: ")
    hra = float(hra)
    ta = input("Enter TA: ")
    ta = float(ta)
    others = input("Enter Others: ")
    others = float(others)
    print("Basic Salary: ", bs)
    print("DA : $", da)
    print("HRA : $", hra)
    print("TA : $", ta)
    print("Others : $", others)
    print("Tax cuts - a) PF :14% of Basic salary and b) IT: 15% of Basic salary")
    print("PF : $", bs * 0.14)
    print("IT : $", bs * 0.15)
    print("Net Salary = Basic Salary + DA + HRA + TA + Others - (PF + IT)")
    print("Net Salary : $", bs + da + hra + ta + others - (bs * 0.14 + bs * 0.15))

    print(" ")

def main():
    again = "Y"

    while again == "Y" or again == "y":

        print("\nChoose the program you want to run")
        print()
        print("Number 1")
        print("Number 2")
        print("Number 3")
        print("Number 4")
        print("Number 5")
        print("Number 6")
        print()

        choice = int(input("Enter your choice: "))

        if choice == 1:
            program1()
        elif choice == 2:
            program2()
        elif choice == 3:
            program3()
        elif choice == 4:
            program4()
        elif choice == 5:
            program5()
        elif choice == 6:
            program6()
        else:
            print("Invalid choice.")

        again = input("\nDo you want to continue? Y/N: ")

    print("Program ended.")


main()