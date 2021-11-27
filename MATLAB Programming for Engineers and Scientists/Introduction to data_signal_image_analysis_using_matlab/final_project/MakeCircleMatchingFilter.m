%{

MakeCircleMatchingFilter
Create a function MakeCircleMatchingFilter, which you will use in your final project script. It takes as input
filter. It outputs the [WxW] matrix filter, which is a binary mask that contains, as foreground, a circle with wid
filter serves as a matching filter for circular shapes with approximately the same diameter. The function also
and 3rd optional outputs.
The steps to perform in the function are as follows:
Initialize filter as a background (zeros) matrix.
Find the coordinates of the center of the filter, xc, and yc.
Use nested for loops to loop across every row and column of the filter matrix. For each pixel, determ
radius relative to the center of the filter. If so, should be labelled as foreground with a 1.
When running the example code below, your function should result in output identically to this:

%}


function [filter,xc,yc] = MakeCircleMatchingFilter(diameter,W)
% Initialize filter
    filter = zeros(W,W);
% Define coordinates for the center of the W x W filter
    xc = (1 + W) / 2;
    yc = (1 + W) / 2;
% Use nested for loops to check if each pixel lies in the foreground of the circle. If so, label it as foreground with a 1.
    for i = 1 : W
         for j = 1 : W
             if sqrt((j - xc)*(j - xc) + (i - yc)*(i - yc)) <= (diameter/2)
                 filter(i,j) = 1;
             end
         end
    end
end



%{

diameter = 20;
W = 30;
[filter, xc, yc] = MakeCircleMatchingFilter(diameter,W);
imagesc(filter); colormap(gray)
xc % should be 15.5
yc % should be 15.5

diameter = 20;
W = 31;
[filter, xc, yc] = MakeCircleMatchingFilter(diameter,W);
figure; imagesc(filter); colormap(gray);
xc % should be 16
yc % should be 16

%}
