while True: # Infinite loop to keep the main menu active
    print("CHOICE: ")
    print("1. Message (Bytes & Bytearray Operations)") # Displays the first option
    print("2. Name (String Manipulation)") # Displays the second option
    print("3. Exit Program") # Displays the third option
    print("=" * 45) # Prints closing visual separator line
    
    choice = input("Select an option (1-3): ").strip() # Gets user choice and strips whitespace

    # =========================================================================
    # OPTION 1: MESSAGE (BYTES & BYTEARRAY OPERATIONS)
    # =========================================================================
    if choice == '1': # Executes if the user selected menu option 1
        while True: # Keeps the message operations menu running repeatedly
            # Accept any text input from the user
            user_input = input("\nEnter your message: ") # Prompts user for a raw text message

            # 1. Convert the input text to a bytes object using UTF-8
            bytes_obj = user_input.encode('utf-8') # Converts text string to bytes using UTF-8
            print(f"1. Bytes object: {bytes_obj}") # Displays the resulting immutable bytes object

            # 2. Convert the bytes object back into a string
            str_obj = bytes_obj.decode('utf-8') # Converts the bytes object back into a string
            print(f"2. Bytes to string: {str_obj}") # Displays the decoded original string value

            # 3. Convert the bytes object to a hexadecimal representation string
            hex_str = bytes_obj.hex() # Converts byte values to their hexadecimal representation
            print(f"3. Bytes to hex: {hex_str}") # Displays the formatted hexadecimal string

            # 4. Turn the hexadecimal string back into raw bytes
            bytes_from_hex = bytes.fromhex(hex_str) # Converts the hex string back into actual bytes
            print(f"4. Hex to bytes: {bytes_from_hex}") # Displays reconstructed original bytes object

            # 5. Build a new bytearray directly from the initial text input string
            ba_direct = bytearray(user_input, 'utf-8') # Instantiates a mutable bytearray using input text
            print(f"5. New bytearray: {ba_direct}") # Displays the mutable bytearray structure

            # 6. Build a separate bytearray utilizing the bytes object from Task 1
            ba_from_bytes = bytearray(bytes_obj) # Instantiates a bytearray from the existing bytes
            print(f"6. Bytes to bytearray: {ba_from_bytes}") # Displays bytearray constructed from bytes

            # 7. Dynamically slice the bytes object
            # Note: If the text is "Hello Python", this extracts "Python".
            sliced_bytes = bytes_obj[6:] # Slices the bytes starting from index position 6
            print(f"7. Sliced bytes: {sliced_bytes}") # Displays the sliced portion of the bytes

            # 8. Modify the first index character of the bytearray to lowercase, then decode it
            if len(ba_from_bytes) > 0: # Checks if the bytearray contains at least one element
                # Gets the string letter, makes it lowercase, and saves its integer ASCII position
                ba_from_bytes[0] = ord(chr(ba_from_bytes[0]).lower()) # Lowercases first byte value in place

            decoded_modified = ba_from_bytes.decode('utf-8') # Decodes modified bytearray back to string
            print(f"8. Modified message: {decoded_modified}") # Displays the modified decoded message string

            cp = input("\nDo you want to continue with Message Program? (YES/NO): ").strip().upper() # Prompts to repeat option 1
            if cp == 'NO': # Checks if user entered NO to stop
                print("Returning to Main Menu...\n") # Informs user about returning to menu
                break # Exits the inner message operations loop
            elif cp == 'YES': # Checks if user entered YES to loop
                continue # Continues the loop from the beginning
            else: # Fallback condition for invalid options
                print("Invalid input. Please enter YES or NO. Continuing by default.\n") # Informs user of default action

    # =========================================================================
    # OPTION 2: NAME (STRING MANIPULATION)
    # =========================================================================
    elif choice == '2': # Executes if the user selected menu option 2
        while True: # Keeps the string manipulation program running repeatedly
            # Task 1: Accept dynamic user input for names
            first_name = input("\nEnter first name: ") # Prompts user to enter their first name
            last_name = input("Enter last name: ") # Prompts user to enter their last name

            print(f"First name: {first_name}") # Displays inputted first name
            print(f"Last name: {last_name}") # Displays inputted last name

            # Task 2: Concatenate strings with a space
            full_name = first_name + " " + last_name # Combines first and last name with separator
            print(f"Full name: {full_name}") # Displays the concatenated full name string

            # Task 3: Access characters using indexing
            # Handles empty inputs safely by checking length
            first_char = full_name[0] if len(full_name) > 0 else "" # Safely gets first char if not empty
            last_char = full_name[-1] if len(full_name) > 0 else "" # Safely gets last char if not empty
            print(f"First character: {first_char}") # Displays extracted first character
            print(f"Last character: {last_char}") # Displays extracted last character

            # Task 4: Demonstrate immutability (Fixes item assignment to trigger TypeError)
            try: # Begins try block to catch potential assignment exception
                full_name[0] = "D" # Intentionally attempts editing string to show error
            except TypeError: # Catches expected TypeError triggered by immutability
                print("Strings are immutable; individual characters") # Prints part one of explanation
                print("cannot be changed directly.") # Prints part two of explanation

            # Task 5: Create a new string using concatenation and slicing
            new_name = "D" + first_name[1:] if len(first_name) > 0 else "D" # Concatenates 'D' with first name slice
            print(f"New name: {new_name}") # Displays newly created modified name string
            print(f"Original name: {first_name}") # Displays original unchanged first name

            # Task 6: Traverse a string using a for loop
            print("Characters in the full name:") # Prints label header for list of characters
            for char in full_name: # Loops through every character inside full_name string
                print(char) # Outputs the current character on a new line

            # Task 7: Slice a string dynamically based on input length
            sliced_first = full_name[0:len(first_name)] # Slices full name from start to end of first name
            # Starts slicing right after the space character
            sliced_last = full_name[len(first_name) + 1:] # Slices remaining last name portion
            print(f"Sliced first name: {sliced_first}") # Displays sliced first name string
            print(f"Sliced last name: {sliced_last}") # Displays sliced last name string

            # Task 8: Search for a character with single-character validation
            while True: # Loop to ensure input conforms to single-character constraint
                search_char = input("Enter one character to search: ") # Prompts user for a target character
                if len(search_char) == 1: # Checks if input is exactly one character long
                    break # Exits the single-character validation loop
                print("Invalid input. Please enter exactly one character.") # Alerts user of bad length

            if search_char in full_name: # Checks if the searched character is inside full_name
                index = full_name.find(search_char) # Finds index position of searched character
                print(f"Character found at index: {index}") # Displays found index location
            else: # Fallback execution if character is missing
                print("Character not found in the full name.") # Informs user character was not located

            # Dynamically updates the final explanatory note based on your input
            if len(first_name) > 0 and len(last_name) > 0: # Checks if both names contain characters
                print(f'The blank line between {first_name[-1]} and {last_name[0]} is the space in "{full_name}".') # Specific output message
            else: # Alternative fallback print formatting
                print(f'The blank line represents the space in "{full_name}".') # Generic fallback output message

            cp = input("\nDo you want to continue with Name Program? (YES/NO): ").strip().upper() # Prompts if user wants to repeat option 2
            if cp == 'NO': # Checks if user entered NO to end string menu
                print("Returning to Main Menu...\n") # Outputs back-to-menu status
                break # Exits the name program inner loop
            elif cp == 'YES': # Checks if user entered YES to loop
                continue # Repeats name loop sequence
            else: # Action on invalid inputs
                print("Invalid input. Please enter YES or NO. Continuing by default.\n") # Informs user of recovery route

    # =========================================================================
    # OPTION 3: EXIT PROGRAM
    # =========================================================================
    elif choice == '3': # Triggers if the user wants to terminate program
        print("Program terminated. Thank you!\n") # Prints closing exit message
        break # Breaks the main infinite menu loop to stop execution

    else: # Fallback logic when user selection does not match standard options
        print("Invalid choice. Please select a valid option from the menu (1, 2, or 3).\n") # Warns user about invalid menu choices