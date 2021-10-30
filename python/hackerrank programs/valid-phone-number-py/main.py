n=int(input())
for i in range(n):
    number=input()
    if(not(number.isdecimal()) or len(number)!=10 or (number[0]>='0' and number[0]<='6')):
        print("NO")
    elif(len(number)==10 and number[0]>='7' and number[0]<='9'):
        print("YES")