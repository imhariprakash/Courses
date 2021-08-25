function [add,sub,mul]=asmd(a,b,c)
if nargin<3
    c=0;
if nargout==3
    add=a+b+c;
    sub=a-b-c;
    if c==0
      mul=a*b;
    else
      mul=a*b*c;
    end
elseif nargout==2
    add=a+b+c;
    sub=a-b-c;
else
    add=a+b+c;
end
end