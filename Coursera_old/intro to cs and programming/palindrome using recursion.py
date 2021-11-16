def palindrome(a):
    a=a.lower()
    #a=a.replace(' ','')
    for i in a:
        if not(i.isalnum()):
            a=a.replace(i,'')
    print(ispal(a))

def ispal(a):
    if len(a)<=1:
        return True
    else:
        return(a[0]==a[-1] and ispal(a[1:-1]))
    
