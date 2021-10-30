import email.utils
def users(user):
    if(user[0].isalpha()):
        user=user.replace('_','')
        user=user.replace('-','')
        user=user.replace('.','')
        if(user.isalnum()):
            return True
    return False
        
        
    
n=int(input())
for i in range(n):
    mail=input()
    temp=email.utils.parseaddr(mail)
    domain=temp[1]
    if '@' in domain and '.' in domain:
        temp=domain.rpartition('@')
        user=temp[0]
        domain=temp[2]
        domain=domain.rpartition('.')
        extension=domain[2]
        domain=domain[0]
        if(domain.isalpha() and extension.isalpha() and len(extension)<=3 and users(user)):
            print(mail)
