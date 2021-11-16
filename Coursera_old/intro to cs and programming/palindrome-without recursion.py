def palindrome(a):
    for i in a:
        if not(i.isalnum()):
            a=a.replace(i,'')
    a=a.lower()
    #a=a.replace('?','')
    #a=a.replace(' ','')
    s=a[::-1]
    if (a==s):
        print('PALINDROME')
    else:
        print("NO")

        
