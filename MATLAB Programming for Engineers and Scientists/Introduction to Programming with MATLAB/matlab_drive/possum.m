function [n total]=possum(limit)
n=0;
total=0;
while(total<limit)
    n=n+1;
    total=total+n;
end
end
