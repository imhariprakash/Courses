function h=my_conv(x,y)
dim=length(x)+length(y)-1;
h=zeros(1,dim);
x=[x,zeros(1,dim-length(x))];
y=[y,zeros(1,dim-length(y))];
for i=1:dim
    h(1,i)=sum(x(1,i:-1:1).* y(1,1:i));
end
end

% %x =
% 
%      3     4     5     2
% 
% 
% y =
% 
%      1     2     5

                
