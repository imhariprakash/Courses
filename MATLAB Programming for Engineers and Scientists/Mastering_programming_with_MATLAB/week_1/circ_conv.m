function z=circular_conv(x,y)
z=[];
len=max(length(x),length(y));
if length(x)~=len
    x=[x,zeros(1,len-length(x))];
elseif length(y)~=len
    y=[y,zeros(1,len-length(y))];
end
i=0;
for k=1:len
    z=[z;circshift(x,i)];
    i=i+1;
end
z
z=(z')*(x');
end