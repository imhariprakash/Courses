%% Example 1
%Skipping is accomplished using a while loop
ii=1;
while(ii<length(readings) && readings(ii)<=100)
    readings(ii)=0;
    ii=ii+1;
end
%% Example 2
% skipping is accomplished using a for loop
for ii=1:length(readings)
    if readings(ii)<=100
        readings(ii)=0;
    else
        break;
    end
end
%% Example 3
% display the index at which the array exceed 100
for ii=1:length(readings)
    if readings(ii)<=100
        readings(ii)=0;
    else
        break;        
    end
end
fprintf('First reading above 100 is at index %d.\n',ii);

