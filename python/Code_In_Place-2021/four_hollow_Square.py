# +----+----+

# |    |    |

# |    |    |

# |    |    |

# |    |    |

# +----+----+

# |    |    |

# |    |    |

# |    |    |

# |    |    |

# +----+----+

row=11
#row=int(input("Enter the number of rows: "))
for i in range(1,row+1):
    for j in range(1,row+1):
        if ((i==1 or i==round(row/2) or i==row)and(j==1 or j==round(row/2) or j==row)): # when this is true print +
            print("+",end="")
        elif((i!=1 or i!=round(row/2) or i!=row)and(j==1 or j==round(row/2) or j==row)): #when this is true print |
            print("|",end="")
        elif((i==1 or i==round(row/2) or i==row)and(j!=1 or j!=round(row/2) or j!=row)): #when this is true print -
            print("-",end="")
        else:
            print(" ",end="")
    print("\n")
