% Digit Summation
% 
% Write a recursive function called digit_sum that computes the sum of the digits of a positive integer provided as
% not allowed to use loops or string conversion functions like str2num. As an illustration, the sum of the digits of th
% you need to do to get the last digit of a base 10 number.


function output=digit_sum(n,output)
if nargin==1
    output=0;
end
if n==0
    return;    
else
    output=output+rem(n,10);
    n=fix(n/10);
    output=digit_sum(n,output);
end
end

%% efficient
function output1=digit1_sum(n)
if n==0
    output=0;
else
    output=digit_sum(fix(n/10))+rem(n,10);
end