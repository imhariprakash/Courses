function valid=valid_date(year,month,day)
if((~isscalar(year))||(~isscalar(month))||(~isscalar(day))||(year<=0)||(month<=0)||(day<=0)||(month>12)||(day>31)||(~(year==fix(year)))||(~(month==fix(month)))||(~(day==fix(day))))
    valid=false;
    return
end
if (month==2)
    if((mod(year,4)==0 && mod(year,100)~=0)||(mod(year,400)==0))
        if day<30
            valid=true;
            return
        else
            valid=false;
            return
        end
    else
        if day<29
            valid=true;return
        else
            valid=false;return
        end
    end
else
    month_days=[31,28,31,30,31,30,31,31,30,31,30,31];
    if day<=month_days(month)
        valid=true;
        return
    else
        valid=false;
        return
    end
end
end