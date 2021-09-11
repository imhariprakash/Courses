% Reverse a Vector
% 
% Output
% w = Write a recursive function called reversal that returns the input vector with its elements reversed. For example
% v = reversal([1 2 3])
%  would set v equal to [3 2 1]. Of course, you can use the MATLAB indexing trick of
% v = v(end:-1:1)
%  but that would not be recursive. Don’t ruin the fun!
% Hint: one way to do it manually: move the first element to last and reverse the rest of the vector. Try to formulate

function w=reverse_array_mysol(v)
if length(v)==1
    w=v(1);
else
    w=[reverse_array_mysol(v(2:end)),v(1)];
end

% v = [1 2 3 4 5];
% w = reversal(v)