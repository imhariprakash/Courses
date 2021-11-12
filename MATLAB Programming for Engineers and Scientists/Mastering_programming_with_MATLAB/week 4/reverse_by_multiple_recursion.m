function vec=reverse_by_multiple_recursion(vec)
len=length(vec);
if(len > 1)
    if(mod(len,2)~=0)
        hlen=ceil(len/2);
        fhalf=vec(1:hlen);
        fmid=vec(hlen+1);
        fend=vec(hlen+2:end);
        vec=[reverse_by_multiple_recursion(fend) fmid reverse_by_multiple_recursion(fhalf)];
    else
        hlen=ceil(len/2);
        fhalf=vec(1:hlen);
        fend=vec(hlen+1:end);
        vec=[reverse_by_multiple_recursion(fend) reverse_by_multiple_recursion(fhalf)];
    end
end
end

%{
function v=reversal(v)
if(length(v)>1)
d=length(v);
x=0;
if mod(d,2)==0
    x1=d/2;
    x2=x1+1;
    m=v(1:x1);
    n=v(x2:end);
    v=[reversal(n),reversal(m)];
else
    x1=fix(d/2);
    x2=x1+2;
    m=v(1:x1);
    mid=(x1+1:x1+1);
    n=v(x2:end);
    v=[reversal(n),v(mid),reversal(m)];
end
end
end
%}

%{
We spent some time on the my_flip problem, the one about flipiing the elements of a vector. Earlier in this co
code may have looked like this:
function v = reversal(v)
 if length(v) > 1
 v = [v(end) reversal(v(1:end-1))];
 end
end
This works well for smaller inputs but what if we have a really long vector? MATLAB may run out of stack spa
function calls. Your mission, should you choose to accept it, is to improve this recursive implementation to m
stay recursive; it just cannot have as many nested recursive calls as the number of elements the list has! (Hi
seemingly unrelated, may give you an idea...)



%}