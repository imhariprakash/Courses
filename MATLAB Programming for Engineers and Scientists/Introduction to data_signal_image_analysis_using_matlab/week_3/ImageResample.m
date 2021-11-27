%{
Image resampling
Write a function ImageResample, which takes as input an [MxN] image matrix img that we would like to res
resampled image, using the interp2 and meshgrid functions as shown in the lecture. The function outputs im
dimensions dim.
(Note that MATLAB's built in function imresize is typically used to resample images because it implements an
understanding how to resample an image grid using linear interpolation as we do in this problem is also a us
Running the example code below, you should get output identical to this:

ans = 15 10
ans = 20 25

https://lcms-files.mathworks.com/content/images/6634f516-edca-4fa6-9e5b-2c4f919e6c81.png
%}

function img_resample = ImageResample(img, dim)
% define r,c,nr,nc
    [r,c] = size(img);
    nr = dim(1);
    nc = dim(2);
% use the meshgrid function to determine sampling coordinates
    [C,R] = meshgrid(1:(c-1)/(nc-1):c, 1:(r-1)/(nr-1):r);
% use interp2 to interpolate
    img_resample = interp2(double(img), C, R, 'linear');
end


%{
[C,R] = meshgrid(1:10,1:15); % inputs are ordered columns, then rows
img = uint8(C.*R);
size(img) % = 15 x 10
dim = [20;25];
img_resample = ImageResample(img, dim);
size(img_resample) % = 20 x 25
imagesc(img);
figure
imagesc(img_resample)
%}
