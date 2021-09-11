% Maximum Element
% 
% Write a recursive function called recursive_max that finds the maximum element in a vector. You are not allowe
% sole output argument is the maximum value in the input vector. Hint: the maximum value of a vector is the larger

function maxi=recursive_max(v)
if length(v)==1
    maxi=v(1);
else
    maxi=biggest(v(1),recursive_max(v(2:end)));
end
end

function big=biggest(a,b)
big=b;
if a>b
    big=a;
end
end