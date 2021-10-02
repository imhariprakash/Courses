'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
n=int(input("Enter the number of elements: "))
lst=[]
for i in range(n):
    lst.append(input("Enter the element: "))
print(lst)

for i in range(n):
    for j in range(n):
        if(i<=j):
            print(lst[j-i],end=" ")
        else:
            a=n-(i-j)
            print(lst[a],end=" ")
    print("\n")