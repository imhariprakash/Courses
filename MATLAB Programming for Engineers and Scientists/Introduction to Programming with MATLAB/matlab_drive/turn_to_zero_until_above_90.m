for x=1:size(a,1)
    for y=1:size(a,2)
        if a(x,y)<=90
            a(x,y)=0;
        else
            break;
        end
    end
end