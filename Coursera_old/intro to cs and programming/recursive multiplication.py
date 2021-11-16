def rec_mul(a,b):
	if(b==0):
		return 0
	elif(b>0):
		return(a+rec_mul(a,b-1))
	elif(b<0):
		return(-a+rec_mul(a,b+1))

print(rec_mul(2,3))
print(rec_mul(-2,3))
print(rec_mul(2,-3))
print(rec_mul(-2,-3))
