function z=circular_conv(x,y)
subplot(2,2,1);stem(x);
title("X-plot");xlabel("n values");ylabel("x(n) values");
subplot(2,2,2);stem(y);
title("Y-plot");xlabel("n values");ylabel("y(n) values");
z=[];
len=max(length(x),length(y));
if length(x)~=len
    x=[x,zeros(1,len-length(x))];
elseif length(y)~=len
    y=[y,zeros(1,len-length(y))];
end
i=0;
for k=1:len
    z=[z;circshift(y,i)];
    i=i+1;
end
z=(z')*(x');
subplot(2,2,[3,4]);stem(z);
title("h-plot");xlabel("n values");ylabel("h(n) values");
end