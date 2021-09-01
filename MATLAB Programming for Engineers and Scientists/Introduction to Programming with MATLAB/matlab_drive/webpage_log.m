function open_webpage
url=input('Enter the URL: ','s');
if isempty(url)
    fprintf("\nURL can't be empty!");
    return;
end
date_time=datetime;
status=web(url);
if status==0
    fprintf("\nAt %s,you opened the website at %s",date_time,url);
else
    fprintf("\nCouldn''t open the Web Browser!");
end
[~,week_day]=weekday(date_time,'long');
fprintf("\nHave a great %s\n",week_day);

end