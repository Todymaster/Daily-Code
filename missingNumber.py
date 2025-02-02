def main():
    #Imports the randint function from the random module
    from random import randint

    #Picks a random number between 1-15
    random_number = randint(1, 15)

    #Makes a list
    random_list = []

    #Puts the random number of numbers into the list
    for i in range(1, random_number + 1):
        random_list.append(i)

    #Removes the random number from the list
    remove_number = randint(1, random_number)
    random_list.remove(remove_number)

    #Prints the list with the missing number
    print("Missing number list:", random_list)

    #Calls the function to find the missing number in the list
    random_list = missing_number_finder(random_number, random_list)

    #Prints the list after the missing number is found and added back to the list
    print("List after missing number is found:", random_list)


def missing_number_finder(random_number, random_list):
    #For loops that runs through the list to find which number is missing
    for num in range(1, random_number + 1):
        if num not in (random_list):
            random_list.insert(num - 1, num)
    
    #Returns the fixed list
    return random_list

#Calls main function to run the code
main()
