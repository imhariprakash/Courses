function h=my_conv(x,y)
subplot(2,2,1);stem(x);
title("X-plot");xlabel("n values");ylabel("x(n) values");
subplot(2,2,2);stem(y);
title("Y-plot");xlabel("n values");ylabel("y(n) values");
dim=length(x)+length(y)-1;
h=zeros(1,dim);
x=[x,zeros(1,dim-length(x))];
y=[y,zeros(1,dim-length(y))];
for i=1:dim
    h(1,i)=sum(x(1,i:-1:1).* y(1,1:i));
end
subplot(2,2,[3,4]);stem(h);
title("h-plot");xlabel("n values");ylabel("h(n) values");
end

% %x =
% 
%      3     4     5     2
% 
% 
% y =
% 
%      1     2     5