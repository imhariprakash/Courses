%{
Standard Deviation Distance

Write a function called standard_deviation_distance that takes as input a [1xN] data vector v and a [1x1] n
"standard deviation distance" from x to dataset v. The standard deviation describes the typical distance of th
deviation distance to a new number x describes how many multiples of the standard deviation that the numb
much of an outlier the new number is. For example a standard deviation distance of 1 would imply x falls 1 s
fairly representative of this dataset, whereas a distance of 3 or more would imply that x falls 3 or more stand
The distance should be what is called a "signed distance", where the function returns a postive distance for i
distance for input values of x less than the mean of v. For example, the standard deviation distance of x=7 fr
2, is equal to -2.5 because x is 2.5 standard deviations below the mean of v

%}

function dist = standard_deviation_distance(v,x)  
dist=(x-mean(v))/std(v);
end

%{
v = [10 12 14];
x = 7;
dist = standard_deviation_distance(v,x)% =-2.5
%}