txt = "Hello World!"
print(txt[2:5].upper())
print(txt.upper())
name = "Python"
print("I love Python")

print("")
print(10>5)
print(10==5)
print(10<5)

print("")
print(10>5)
print(10==5)
print (bool("Hello"))
print (bool(0))

print("")
a=15
b=4
print(a%b)
print(a//b)
print(a**b)
a += 10
print("The Value of a is ", a)

print("")

thislist = ["apple", "banana", "cherry"]
print(thislist)

print("")

thislist2 = ["apple", "banana", "cherry", "apple", "cherry"]
print(thislist2)

print("")

#append
thislist3 = ["apple", "banana", "cherry"]
thislist3.append("orange")
print(thislist3)

print("")

#insert
thislist4 = ["apple", "banana", "cherry"]
thislist4.insert(2,"Maksuda")
print(thislist4)

print("")

#remove
thislist5 = ["apple", "banana", "cherry", "Maksuda"]
thislist5.remove("Maksuda")
print(thislist5)

print("")

#pop
thislist6 = ["apple", "banana", "cherry", "Maksuda"]
thislist6.pop(1)
print(thislist6)

print("")
#del
thislist7 = ["apple", "banana", "cherry"]
del thislist7[0]
print(thislist7)

print("")
#del
# thislist8 = ["apple", "banana", "cherry"]
#for i in range(len(thislist8))
#print(thislist8[i])

print("")
#dsajsad
colors = ["red", "green", "blue"]
print(colors[0])
colors[1] = "yellow"
colors.append("purple")
colors.remove("red")
print(colors)

print("")
#dsajsad
thistuple = ["apple", "banana", "cherry"]
print(thistuple)

print("")
#dsajsad
thistuple2 = "apple", "banana", "cherry"
print(thistuple2)

print("")
#dsajsad
thistuple3 = ["apple", "banana", "cherry"]
print(thistuple3[-1])

print("")
#dsajsad
thistuple4 = ["apple", "banana", "cherry", "orange", "kiwi", "melon", "mango"]
print(thistuple4[3:6])

print("")
#if
#elif
a =200
b = 33
if b>a:
    print("b is greater than a")
elif a == b:
    print("a and b is equal")
else:
    print("a is greater than b")

print("")
#if
#elif
age = 20
if age < 13:
    print("Child")
elif age < 18:
    print("Teenager")
else:
    print("Adult")