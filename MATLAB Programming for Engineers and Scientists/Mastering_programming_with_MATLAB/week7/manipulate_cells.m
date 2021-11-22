clc;clear;
load("covid_data.mat");
temp_country=unique(covid_data(:,1));
num_country=length(unique(covid_data(:,1)));
num_states=length(covid_data(:,1));
temp_states=covid_data(:,1:2);
states=strings(num_states,2);
country=strings(1,num_country);
for i=1:num_country
    country(1,i)=string(temp_country{i,1});
end
for i=1:num_states
    states(i,1)=string(temp_states(i,1)); 
    states(i,2)=string(temp_states(i,2));
end
clear i num_states num_country temp_country temp_states
