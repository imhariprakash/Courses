n=int(input())

for i in range(n):
    upp=0
    dig=0
    rep=0
    word=input()
    if(len(word)==10 and word.isalnum()):
        for j in range(len(word)):
            if(word[j]>='A'and word[j]<='Z'):
                upp+=1
            if(word[j]>='0' and word[j]<='9' ):
                dig+=1
            for k in range(len(word)):
                for l in range(k+1,len(word)):
                    if(word[k]==word[l]):
                        rep+=1
        if(rep==0 and upp >= 2 and dig>=3):
            print("Valid")
        else:
            print("Invalid")
    else:
        print("Invalid")
    print(upp,dig,rep)