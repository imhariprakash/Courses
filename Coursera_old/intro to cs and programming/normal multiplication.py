##def nor_mul(a,b):
##	if(a==0)or(b==0):
##		return 0
##	else:
##		return (a*b)

def normal_mul(a,b):
    if(a==0) or (b==0):
        return 0
    result=0
    if(b>0):
        for i in range(b):
            result+=a
        return result
    elif(b<0):
        for i in range(-b):
            result+=(-a)
        return result
