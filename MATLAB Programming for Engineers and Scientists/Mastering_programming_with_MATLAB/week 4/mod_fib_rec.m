function [f,count]=mod_fib_rec(n)
persistent cnt;
if isempty(cnt)
    cnt=1;
else 
    cnt=cnt+1;
end
if(n<=2)
    f=ones(1,n);
else
    f=mod_fib_rec(n-1);
    f=[f f(end-1)+f(end)];
end
count=cnt;
end