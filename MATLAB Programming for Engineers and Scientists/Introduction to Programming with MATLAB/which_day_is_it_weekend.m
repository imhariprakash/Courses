function day(n)
if n==1
    fprintf('Sunday!\n');
    weekend=2;
elseif n==2
    fprintf('Monday!\n');
    weekend=1;
elseif n==3
    fprintf('Tuesday!\n');
    weekend=1;
elseif n==4
    fprintf('Wednesday!\n');
    weekend=1;
elseif n==5
    fprintf('Thursday!\n');
    weekend=1;
elseif n==6
    fprintf('Friday!\n');
    weekend=1;
elseif n==7
    fprintf('Saturday!\n');
    weekend=2;
else
    fprintf('Must enter between 1 to 7. \n');
    return
end
if weekend==1
    fprintf('Not a Weekend!\n');
else 
    fprintf('Weekend!\n');
    
end
