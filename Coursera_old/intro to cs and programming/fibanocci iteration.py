def fib(n):
    if(n==0) or(n==1):
        return n
    previous=0
    current=1
    result=0
    for i in range(n-1):
        result=previous+current
        previous=current
        current=result
    return result
