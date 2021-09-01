function total=hello(n)
persistent result;
if isempty(result)
    result=n;
else
    result=result+n;
end
total=result;
end