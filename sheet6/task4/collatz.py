def collatz(number):
    if (number & 1) == 0:
        return number >> 1

    else:
        return 3 * number + 1


print("enter a number:")
number = (int(input()))

while(number < 0):
    print("Please enter a valid INTEGER.")
    number = (int(input()))

while number != 1:
    print(number)
    number = collatz(int(number))
