%% efficient one

% function out=gcd_me(a,b)
% if a<0 || b<0 || ~isscalar(a) || ~isscalar(b) || fix(a)~=a || fix(b)~=b
%      error("Inputs must be a positive scalar integer !");
% end
% x=max(a,b);
% y=min(a,b);
% if y==0
%     out=x;
% else
%     out=gcd_me(y,rem(x,y));
% end
% end

%% iterative version

function iter_gcd(a,b)
if a<0 || b<0 || ~isscalar(a) || ~isscalar(b) || fix(a)~=a || fix(b)~=b
     error("Inputs must be a positive scalar integer !");
end
x=max(a,b);
y=min(a,b);
while y~=0
    r=rem(a,b);
    x=y;
    y=r;
end
x
end
%%
% function gcdd(a,b)
% if a<0 || b<0 || ~isscalar(a) || ~isscalar(b) || fix(a)~=a || fix(b)~=b
%     error("Inputs must be a positive scalar integer !");
% end
% if a<b
%     tmp=a;a=b;b=tmp;
% end
% gcd=gcddd(a,b,0)
% end
% 
% function tmp=gcddd(a,b,tmp)
% if b==0
%     tmp=a;
%     return;
% else
%     tmp=gcddd(b,rem(a,b),tmp);
% end
% end