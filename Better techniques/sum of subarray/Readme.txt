brute force algorithm : normal method : n queries each query take some steps(1 to n)steps

1+2+3+....+n = n(n-1)/2  = O(n^2)


so i want queries in constant time

solution build a array which has partial sub array sum 


[1 2 3 4 5]  -> partial subarray(assume partArray[0] = 0  -> [0 1 3 6 10 15]

subarray 1 to 4 (index 0 to 3) (1+2+3+4 = 10) -> 

partArray[b] - partArray[a - 1] -> gives the result


build partArray:  linear time


partArray[0] = 0

loop from 1 to array.length + 1 (input array) - since partArray has length + 1

partArray[i]  = array[i - 1] + partArray[ i - 1 ] 