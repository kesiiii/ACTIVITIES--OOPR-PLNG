print("PROGRAM 1")
print("Hello World")
 
print(" ")
print(" ")
print("PROGRAM 2")
usertext = input("What is your name? ")
print("Hello", usertext)

print(" ")
print(" ")
print("PROGRAM 3")
num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

sum = float(num1) + float(num2)

print('The sum of {0} and {1} is {2}'.format(num1, num2, sum))

print(" ")
print(" ")
print("PROGRAM 4")
num1 = input('Enter first number: ')
num2 = input('Enter second number: ')

average =(int(num1) + int(num2))

print('average:{0} '.format(average))

print(" ")
print(" ")
print("PROGRAM 5")
visagrade = input('enter your visa grade : ')
finalgrade = input('enter your final grade : ')
average =(float(visagrade)*0.3)+(float(finalgrade)*0.7)
print("average :{0} ".format(average))

print(" ")
print(" ")
print("PROGRAM 6")
firstexam = input('your first exam : ')
secondexam = input('your second exam : ')
thirdexam = input('your third exam : ')
average =(float(firstexam)+float(secondexam)+float(thirdexam))/3
print("average :{0} ".format(average))

print(" ")
print(" ")
print("PROGRAM 7")

average = input('enter average : ')
if(int(average)>=50):
    print("Passed")
else:
    print("Failed")

print(" ")
print(" ")
print("PROGRAM 8")
num = int(input("Enter a number: "))
if (num % 2) == 0:
    print("{0} is Even".format(num))
else:
    print("{0} is Odd".format(num))   


print(" ")
print(" ")
print("PROGRAM 9")
num = float(input("Enter a number: "))
if num > 0:
    print("Positive number")
elif num == 0:
    print("Zero")
else:
    print("Negative number")



print(" ")
print(" ")
print("PROGRAM 10")
print("body mass index calculation program")
height = float(input("enter height (m):"))
weight = int(input("enter weight (kg):"))

index = weight/(height*height)

if index <=18:
    print("\n underweight BMİ:{}".format(index))
elif index > 18 and index <=25 :
    print("\n overweight BMİ:{}".format(index))
elif index > 25 and index <=30:
    print("\n obese BMİ:{}".format(index))
elif index > 30:
    print("\n severely obese BMİ:{}".format(index))


print(" ")
print(" ")
print("PROGRAM 11")
age = input('enter age : ')
if(int(age)<18):
    print("Your Age Is Not Eligible To Get A Driver's License")
else:
    print("Your Age Is Eligible To Get Your License")


print(" ")
print(" ")
print("PROGRAM 12")
for i in range(1,101):
    print(i)

print(" ")
print(" ")
print("PROGRAM 13")
for i in range(1,101):
    if i%2==0:
        print(i)


print(" ")
print(" ")
print("PROGRAM 14")
for i in range(1,101):
    if i%2!=0:
        print(i)


print(" ")
print(" ")
print("PROGRAM 15")
for i in range(1,101):
    if i%3==0 or i%5==0:
        print(i)


print(" ")
print(" ")
print("PROGRAM 16")
num = input('enter number : ')
for i in range(1,int(num)+1):
    print(i)

print(" ")
print(" ")
print("PROGRAM 17")
short = input('Enter short side : ')
tall = input('Enter tall side : ')
area = int(short)*int(tall)
perimeter =2*(int(short)+int(tall))
print("area: {0}".format(alan))
print("perimeter: {0}".format(cevre))


print(" ")
print(" ")
print("PROGRAM 18")
word = 'mrhuseyin'
for char in word:
    print(char)



print(" ")
print(" ")
print("PROGRAM 19")
sumofnumbers=0;
num1 = input('first number: ')
num2 = input('second number: ')
for i in range(int(sayi1)+1,int(sayi2)):
    sumofnumbers+=i
print("Sum of numbers between {0} and {1} : {2}".format(num1,num2,sumofnumbers))


print(" ")
print(" ")
print("PROGRAM 20")
selection = input("Press (1) for Cinema, (2) for Theater : ")
student = input("Are you student(Y/N) : ")
price = 0
#non-discounted fee calculation
if selection == '1':
    price = 10 #cinema
elif selection == '2':
    price = 5 #theatre
#student discount
if student =='Y' or student =='y':
    price=price / 2 #%50
print(" The fee you have to pay :{}".format(price))
