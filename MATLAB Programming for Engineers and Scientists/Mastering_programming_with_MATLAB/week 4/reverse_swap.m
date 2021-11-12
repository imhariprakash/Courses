lst=1:20;
len=length(lst);
for i=1:floor(len/2)
    temp=lst(i);
    lst(i)=lst(len-i+1);
    lst(len+1-i)=temp;
end
lst
