(random idea struck - looks like working with little optimization of the algorithm)

best case - when 1st min is the one to be found - linear time
worst case - find n th min - where n is the number of elements

n times find max/min
each max/min takes linear (n) time

totally n^2

this time better solution : use quick sort n*log(n) time

most cases dont require that much - linear time is enough!


other solution - to tackle in linear time when  k th min/ max  make it (n-k)th max/min (note : reverse = max means min, min means max)

1 2 3 4 5 6 7 8 9 10

10 th max is same as 1 st min - > (n - 10 + 1) = 1

if(k > (n/2)){
	k = n - k + 1;
	min means call max , max means call min   - > loop
}

else{
	min means min  - loop
	max means max  - loop
}



so even in worst case scenarios done in almost linear time - (constant multiplication dont matter) - almost linear time.
