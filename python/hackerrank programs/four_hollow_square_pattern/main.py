row =11
for i in range(1,row+1):
    for j in range(1,row+1):
        if (i==1 or i==round(row/2) or i==row) and (j==1 or j==round(row/2) or j==row):
            print("+", end="")
        elif (i==1 or i==round(row/2) or j==row or i==row or j==1 or j==round(row/2))and(j!=1 or j!=round(row/2) or j!=row):
            print("-", end="")
        else:
            print(" ", end="")
    print()