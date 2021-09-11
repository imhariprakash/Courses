function maxi=recursive_max(v,len,maxi)
if nargin==1
    len=length(v)-1;
    maxi=v(len+1);
end
if len==0
    return;
else
    if maxi < v(len)
        maxi=v(len);
    end
    maxi=recursive_max(v,len-1,maxi);
end
end        