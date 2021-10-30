import timeit
code="""print("Iron heights")
i=1 
while(i<100001):
    print("Flash Season",i)
    i+=1"""
execution_time = timeit.timeit(code, number=1)

print(execution_time)