import math

s = input("Enter the input: ")
arr = []
len = len(s)
for i in range (1,int(math.sqrt(int(s)))):
    sub = (i*(i+1))
    sub = str(sub)
    if sub in s:
        arr.append(int(sub))
arr.sort()
print(arr)