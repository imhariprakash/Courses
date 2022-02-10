n = input("Enter the number: ")
arr = []
for j in range(len(n)):
    for i in range(0,len(n)):
        temp = n[0:i+1]
        temp = int(temp)
        if(int(n) % temp ==0):
            arr.append(temp)
    n = n[1:]+n[0:1]
arr.sort()
print(arr)


# Enter the number: 123
# [1, 3, 123, 231, 312]