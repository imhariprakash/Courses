function a=multablee
n=5000;
%a=zeros(n);
%already assigned n x n matrix saves huge amount of time
for x=1:n
    for y=1:n
        a(x,y)=x*y;
    end
end
