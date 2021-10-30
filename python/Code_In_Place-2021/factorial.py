def main():
    num=get_num()
    for i in range(num):
        print(i,fact(i))

def fact(number):
    result=1
    for i in range(1,number+1):
                result*=i
    return result

def get_num():
    number=int(input("Enter the number: "))
    return number

if __name__=='__main__':
    main()
    
