%{

Otsu Thresholding
In the lecture, we saw how the function 'otsuthresh' can be used to determine a normalized intensity thresho
Write a function OtsuThreshold, which takes as input an [MxN] uint8 image matrix img, and outputs the Ots
integer threshold thrsh used to make msk.
The steps are:
Define the Otsu threshold thrsh using the histogram of img.
Apply the threshold to img to make msk.
Running the example code below, your output should look identical to this:

%}

function [msk,thrsh] = OtsuThreshold(img)
% Define the Otsu threshold 'thrsh' using the histogram of img
    hst = imhist(img);
    thrsh = otsuthresh(hst)*255;
% Apply the threshold to 'img' to make 'msk'
    msk = (img > thrsh);
end


%{

img = imread('mri.tif');
[msk,thrsh] = OtsuThreshold(img);

imagesc(img)
title('mri')
colormap(gray)
figure();
imagesc(msk)
colormap(gray)
thrsh % = 36

%}
