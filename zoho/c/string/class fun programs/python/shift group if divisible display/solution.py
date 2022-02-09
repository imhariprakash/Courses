n = input("Enter the number: ")
arr = []

def string_change(temp):
    res = "";
    for i in range(0,len(temp)):
        res+=temp[i]
    return(int(res))
for j in range(len(n)):
    for i in range(0,len(n)):
        temp = n[0:i+1]
        temp = string_change(temp)
        if(int(n) % temp ==0):
            arr.append(temp)
    n = n[1:]+n[0:1]
arr.sort()
print(arr)