"""
lis=[5,4,76,4,3,1]
lis.sort()
print(lis)
#lis.sort(reverse=True)
a=sorted(lis,reverse=True)
print(a)

for i in lis:
    print(i)

for i in a:
    print(i)
"""
###################################################################
"""
import math
def DegtoRad():
    deg = float(input("Please enter a degree: "))
    rad = deg * (math.pi/180)
    print(f"The converted {deg} degree is:", rad, "in radian")
    
DegtoRad()
"""
###################################################################
"""
def ListOpt():
    lists = []
    ls = int(input("Input a number of list: "))
    for i in range(0, ls):
        num = int(input("Number: "))
        lists.append(num)
    x = input("What kind of sort do you want to implement?: ")
    if x=="asc":
        lists.sort()
        print(lists)
    elif x=="desc":
        a = sorted(lists, reverse=True)
        print(a)
    else:
        print(lists)
        
ListOpt()
"""
###################################################################
"""
while True:
    lists = []
    ls = input("Input a number of list: ")
    if ls.isdigit():
        for i in range(0, int(ls)):
            while True:
                num = input("Number: ")
                if num.isdigit():
                    lists.append(num)
                    break
                else:
                    print("Please input an integer.")
                    continue
        while True:
            x = input("What kind of sort do you want to implement? (asc/desc/none): ")
            if x=="asc":
                lists.sort()
                print(lists)
                break
            elif x=="desc":
                a = sorted(lists, reverse=True)
                print(a)
                break
            elif x=="none":
                print(lists)
                break
            else:
                continue
        while True:
            cont = input("Do you want to continue? (yes/no): ")
            if cont=="yes":
                break
            elif cont=="no":
                exit()
            else:
                print("Invalid input")
                continue
    else:
        print("Please put an integer.")
"""
###################################################################
"""
def BinDec():
    
    x = int(input("Input a decimal number less than 1024: "))
    if x >= 1:
        ans = bin(x) 
        print(ans.replace("0b", ""))
        
BinDec()
""" 
###################################################################
"""
def Calc():
    a = int(input("Input first number: "))
    b = int(input("Input second number: "))
    c = input("What operation? (+|-|x|/): ")
    match c:
        case "+":
            x = a + b
            print(x)
        case "-":
            x = a - b
            print(x)
        case "x":
            x = a * b
            print(x)
        case "/":
            x = a / b
            print(x)
        case default:
            print("Invalid character, please use the provided symbol")
-------------------------------------------------------
    if c == '+':
        x = a + b
        print(x)
    elif c == '-':
        x = a - b
        print(x)
    elif c == 'x':
        x = a * b
        print(x)
    elif c == '/':
        x = a / b
       print(x)
--------------------------------------------------------
Calc()
"""
###################################################################
"""
st = 'aaacaasagyyasasdiiasdqwicve'
count = 0
for i in range(len(st)):
    if (
        (st[i] == "a")
        or (st[i] == "e")
        or (st[i] == "i")
        or (st[i] == "o")
        or (st[i] == "u")
    ):
        count += 1

print("Number of vowels in the given string is: ", count)
"""
###################################################################
"""
stt = input("input a string: ")
count1 = 0
for i in range(len(stt)):
    if (
        (stt[i] == "a")
        or (stt[i] == "e")
        or (stt[i] == "i")
        or (stt[i] == "o")
        or (stt[i] == "u")
    ):
        count1 += 1

print("Number of vowels in the given string is: ", count1)
"""
###################################################################
"""
base = int(input("Input a base: "))
height = int(input("Input a height: "))
area = (base * height)/2
print("Result:" , area, "square meter")
"""
###################################################################
"""
def HtoS():
    print("Conversion of hours to seconds")
    h = int(input("Input hours: "))
    s = h * 3600
    print("Result:", s, "seconds")

HtoS()
"""
###################################################################
"""
def HtoM(h, w):
    print("Conversion of hours to minutes")
    m = h * 60
    print("Result:", m, "minutes")
    print("Conversion of weeks to days")
    d = w * 7
    print("Result:", d, "days")

HtoM(3, 3)
"""
###################################################################
"""
def remainder():
    print("Getting the remainder from dividing")
    divd = int(input("Dividend: "))
    divs = int(input("Divisor: "))
    quo = divd / divs
    quo1 = divd //divs
    rem = divd % divs
    return print("Quotient:", round(quo,2), "; Quotient(no decimal):", quo1, "; Remainder:", rem)

remainder()
"""
###################################################################
"""
def Fact():
    n = int(input("Finding factorial, input a number: "))
    if n == 0:
        return print("Result: 1")
    else:
        fac = 1
        for i in range(1, n + 1):
            fac *= i
        return print("Result:", fac)

Fact()
"""
###################################################################
"""
def lenNum():
    while True:
        count = 0
        num = input("Input a number, this will determine the length: ")
        if num.isdigit():
            for i in range(len(num)):
                count += 1
        
            print("Length of number", count)
            break
        else:
            #raise TypeError ---other code---
            print("Invalid input, need a number/s.")
            continue

print("The 12313 has the length number of:", len("12313"))
lenNum()
"""
###################################################################
"""
n = 0
print ("Pattern A")
for i in range (0, 5):
    n = n + 1
    for j in range (0, n):
        print ('*', end = '')
    print('')
print ('')

a = 5
print("Pattern B")
for i in range (0, 5):
    a = a - 1
    for j in range (0, a + 1):
        print ('*', end = '')
    print('')
print ('')

b = 0
print("Pattern C")
for i in range (0, 6):
    b += 1
    for j in range (5, 0, -1):
        if j > i:
            print(" ", end='')
        else:
            print("*", end='')
    print('')

c = 5
print("Pattern D")
for i in range (0, 6):
    c -= 1
    for j in range (0, 6, 1):
        if j > i:
            print("*", end='')
        else:
            print(" ", end='')
    print('')

d = 0
print("Pattern E")
for i in range (0, 5):
    d += 1
    for j in range (0, d):
        print(d, end='')
    print('')
print('')

e = 6
print("Pattern F")
for i in range (1, e):
    i += 1
    for j in range (1, i):
        print(j, end='')
    print('')
print('')

f = 5
print("Pattern G")
for i in range (1, f+1):
    for j in range (1, i+1):
        print(5, end='')
    print('')
print('')

def print_pascal_triangle(size):
    print("Pattern H")
    for i in range(0, size):
        for j in range(0, i + 1):
            print(decide_number(i, j), end=" ")
        print()
def decide_number(n, k):
    num = 1
    if k > n - k:
        k = n - k
    for i in range(0, k):
        num = num * (n - i)
        num = num // (i + 1)
    return num
print_pascal_triangle(7)
print('')

g = 8
# rows = int(input("Enter the number of rows "))
print("Pattern I")
for i in range(1, g + 1):
    for j in range(1, i + 1):
        square = i * j
        print(i * j, end='  ')
    print()
print('')
"""
###################################################################
"""
from tkinter import *

def create_window():
    new_window = Tk()
    new_window.geometry("350x200")

    old_window.destroy()

old_window = Tk()
old_window.geometry("350x200")

Button(old_window, text="create new window", command=create_window).pack()

old_window.mainloop()
"""
###################################################################
"""
from tkinter import *

root = Tk()

root.title("Welcome to a")

root.geometry('1000x500')

menu = Menu(root)
item = Menu(menu)
item.add_command(label='New')
menu.add_cascade(label='File', menu=item)
root.config(menu=menu)

lbl = Label(root, text = "Are you ?", font=("Arial", 50))
lbl.grid()

txt = Entry(root, width=10)
txt.grid(column = 1, row =0)

def clicked():
 
    res = "You wrote " + txt.get()
    lbl.configure(text = res)

btn = Button(root, text = "Click me" , fg = "red", command=clicked)

btn.grid(column=5, row=0)
 
root.mainloop()
"""
###################################################################
