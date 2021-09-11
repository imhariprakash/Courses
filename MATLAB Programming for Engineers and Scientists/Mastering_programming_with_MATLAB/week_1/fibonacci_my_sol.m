% Fibonacci Series
% 
% Write a recursive function called fibor that computes the first n elements of the Fibonacci series where n is the
% formal definition of the series:
% Here are the first few elements: 1, 1, 2, 3, 5, 8, 13, ...
% If the grader times out, your function might be making too many recursive calls. For example, if fibor(5) makes th
% called fibor(3) twice unnecessarily. With larger inputs, this may blow up. In that case, you need to rethink your ap
% 
% when n=1 -> [1]
%      n=2 -> [1 1]
%      n=3 -> [1 1 2]

function w=fibor(n)
if n<3
    w=ones(1,n);
    return;
else
    w=fibor(n-1);
    w=[w,sum(w(end:-1:end-1))];
end
end