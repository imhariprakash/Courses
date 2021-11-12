function v=reversal(v,start,stop)
if(nargin==1)
    start=1;
    stop=length(v);
end
if(stop - start <= 1)
    return;
else
    v=reversal(v,start+1,stop-1);
    temp=v(start);
    v(start)=v(stop);
    v(stop)=temp;
end
end