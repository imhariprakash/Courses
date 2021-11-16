def merge(left, right, lt):
    """Assumes left and right are sorted lists.
lt defines an ordering on the elements of the lists.
Returns a new sorted(by lt) list containing the same elements
as (left + right) would contain."""
    result = []
    i,j = 0, 0
    while i < len(left) and j < len(right):
        if lt(left[i], right[j]):
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
    while (i < len(left)):
        result.append(left[i])
        i += 1
    while (j < len(right)):
        result.append(right[j])
        j += 1
    return result
def sort(L, lt = lambda x,y: x < y):
    """Returns a new sorted list containing the same elements as L"""
    if len(L) < 2:
        return L[:]
    else:
        middle = int(len(L)/2)
        left = sort(L[:middle], lt)
        right = sort(L[middle:], lt)
        print (left, right)
        return merge(left, right, lt)
L = [35, 4, 5, 29, 17, 58, 0]
newL = sort(L)
print ('Sorted list =', newL)
L = [1.0, 2.25, 24.5, 12.0, 2.0, 23.0, 19.125, 1.0]
newL = sort(L, float.__lt__)
print ('Sorted list =', newL)
##def lastNameFirstName(name1, name2):
##import string
##name1 = string.split(name1, ' ')
##name2 = string.split(name2, ' ')
##if name1[1] != name2[1]:
##return name1[1] < name2[1]
##else:
##return name1[0] < name2[0]
