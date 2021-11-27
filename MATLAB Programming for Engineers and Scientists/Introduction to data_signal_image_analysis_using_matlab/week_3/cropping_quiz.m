%{
Question 1
Cropping is the process of creating a new image that is formed as a subregion of another image. We define a "cropping box" that contains our region-of-interest, and we are "cropping" away the parts of the image that are not needed, keeping only the region-of-interest in the resulting image. 

Load the built in Matlab image 'logo.tif' using the 'imread' function.  

Crop it to create a new image formed by the subregion of pixels in rows 30 to 50 and columns 20 to 90 in the 'logo.tif' image matrix. 

Display the cropped image using the 'imagesc' function.

What word is displayed?


%}

img = imread('logo.tif');
figure;
imagesc(img(30:50, 20:90));

% answer - > MATH