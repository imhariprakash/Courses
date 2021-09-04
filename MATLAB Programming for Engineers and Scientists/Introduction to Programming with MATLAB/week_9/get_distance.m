%% Excel File I/O
% 
% The attached Distances.xlsx (https://lcms-files.mathworks.com/content/file/348f7627-8238-4f0d-99de-1c15fd5a1
% versionId=rPFc1UxVH04p8nuG6kIM8lEiuYYmE4uC) file contains a spreadsheet with the pairwise distances in m
% spreadsheet is shown below. The first row and first column contain the city names using the following format: cit
% Nashville, TN. Note that the very first cell of the spresheet, A1, is blank.
% Write a function called get_distance that accepts two character vector inputs representing the names of two citi
% argument called distance. For example, the call get_distance('Seattle, WA','Miami, FL') should return 3723. If
% returns -1.
% Your function should load the data only once. File I/O is a time consuming operation. Loading the data multiple t
% function.
% Preview of the first five cities of Distances.xlsx
%% program

function distance=get_distance(city1,city2)
[~,~,data]=xlsread("Distances.xlsx");
city=string(data(1,:));
city1=city_valid(city1,city);
city2=city_valid(city2,city);
if(city1 > 1 && city2 > 1)
    distance=data{city2,city1};
else
    distance=-1;
end
end

function index=city_valid(cit,city)
for x=1:length(city)
    if strcmp(city(1,x),cit)
        index=x;return;
    else
        index=0;
    end
end
end
%% distance = get_distance('Seattle, WA','Miami, FL')

