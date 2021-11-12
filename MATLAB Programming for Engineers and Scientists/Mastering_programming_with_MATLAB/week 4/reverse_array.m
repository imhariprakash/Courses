lst=1:10
for i=2:length(lst)
    temp=lst(i);
    for j=i:-1:2
        lst(j)=lst(j-1);
    end
    lst(1)=temp;
end
lst