def fibanocci(n):
    if (n==0 or n==1):
        return 1
    else:
        return(fibanocci(n-2)+fibanocci(n-1))
    
