function w=fibonacci_mysol_try1(n)
if n<3
    w=ones(1,n);return;
else
    w=fibonacci_mysol_try1(n-1);
    w=[w,sum(w(end:-1:end-1))];
end