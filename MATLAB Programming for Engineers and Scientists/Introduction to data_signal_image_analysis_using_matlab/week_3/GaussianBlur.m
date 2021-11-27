%{

Gaussian Blur
Gaussian filters can be used to blur images or remove high frequency noise.
Write a function called GaussianBlur, which takes as input an image [MxN] img and scalar sigma, represen
the Gaussian filtered image, and [WxW] matrix filt, the Gaussian filter, as a second output. The function use
the next integer.
The steps are:
Use fspecial to generate the [WxW] matrix filt.
Apply the filter to the image using convolution.
Running the example code below, your output should look identical to this:

%}

function [img_filt,filt] = GaussianBlur(img,sigma)
% Use fspecial to generate the Gaussian filter
    w = round(6*sigma);
    filt = fspecial('gaussian', [w,w], sigma);
% Apply the filter to the image using convolution
    img_filt = conv2(img, filt, 'same');
end


%{

sigma = 20; 
img = imread('moon.tif');
[img_filt,filt] = GaussianBlur(img,sigma);
imagesc(img)
title('moon')
colormap(gray)
figure();
imagesc(img_filt)
title('moon blurred with sigma=20')
colormap(gray)
figure;
surf(filt)
title('gaussian filter with sigma=20')

%}
