%{
Given a set of approximate x and y coordinates of points in a plane, determine the best fitting line in the leas
compute a and b. That is, write a function called lin_reg that takes two row vectors of the same length called
and returns two scalars, a and b specifying the line, as output arguments. Here is an example run:
>> [a b] = lin_reg([0 2],[0 2])
a =
 1
b =
 0
Here is what you should see when you hit the "Run Function" button below:
Hint: reformulate the problem so that you can use MATLAB's built-in linear equation solving support, i.e., the
y, a and b are the unknowns and not x what we usually have in a system of linear equations. So, there is so

%}

function [a,b]=lin_reg(x,y)
M=[x',ones(length(x),1)];  %one solution -> [a,b]=M\b;
sol=M\y';
a=sol(1);
b=sol(2);
end

%{
function [a,b]=lin_reg(x,y)
M=[x;ones(1,length(x))]';  %one solution -> [a;b]=M\b;
sol=M\y';
a=sol(1);
b=sol(2);
end
%}

%{
v = rand(1,200) * 10 - 5;
x = v + randn(1,length(v)) / 2;
y = v + randn(1,length(v)) / 2;
[a b] = lin_reg(x,y)
plot(x,y,'.');
grid on
hold on
plot([-5 5],a*[-5 5]+b,'lineWidth',2);
%}