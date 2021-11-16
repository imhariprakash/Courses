def selection(L):
	for i in range(len(L)-1):
		min_index=i
		min_value=L[i]
		j=i+1
		while(j<len(L)):
			if min_value > L[j]:
				min_value=L[j]
			j+=1
		temp=L[i]
		L[i]=min_value
		L[j-1]=temp
	return L
