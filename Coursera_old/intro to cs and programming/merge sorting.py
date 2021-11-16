def sort(L):
    if(len(L)<2):
        return L
    else:
        mid=int(len(L)/2)
        left=sort(L[:mid])
        right=sort(L[mid:])
        return merge(left,right)

def merge(left,right):
    i=0
    j=0
    result=[]
    while((i<len(left))and(j<len(right))):
        if (left[i]>right[j]):
            result.append(right[j])
            j+=1
        else:
            result.append(left[i])
            i+=1
    while(j<len(right)):
        result.append(right[j])
        j+=1
    while(i<len(left)):
        result.append(left[i])
        i+=1
    return result

        
print(sort([1,2,3,4,5]))
print(sort([10,9,8,7,6,5,4,3,2,1]))
print(sort([3,1,5,4,8,66,98,9,8,6,56,789,54,7788,45.6,0.2,0,0.2,0.4]))

      
