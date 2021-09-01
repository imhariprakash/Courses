function f = fibo(n)
if (~isscalar(n) || n<1 || n~=fix(n))
    fprintf('n must be a positive scalar integer\n');
end
f(1)=0;
f(2)=1;
for x=3:n
    f(x)=f(x-2)+f(x-1);    
end
end
