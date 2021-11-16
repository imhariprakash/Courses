def rec_square_root(x,epsilon=0.000000000001,low=None,high=None):
    if(x<1):
        high=1
    if(low==None):
        low=0.0
    if(high==None):
        high=x
    midpoint=(low+high)/2
    if((abs(midpoint**2-x)<epsilon)or(midpoint>x)):
        return midpoint
    else:
        if(midpoint**2<x):
            return(rec_square_root(x,epsilon,midpoint,high))
        elif(midpoint**2>x):
            return(rec_square_root(x,epsilon,low,midpoint))

print(rec_square_root(100))
print(rec_square_root(10))
print(rec_square_root(2))
print(rec_square_root(3))
print(rec_square_root(25))


