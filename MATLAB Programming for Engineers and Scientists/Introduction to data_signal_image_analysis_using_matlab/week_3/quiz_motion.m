%{
Filtering can be used to simulate camera motion occuring when the picture is being taken. The 'fspecial' function can be used to generate a horizontal 'motion' filter that can be convolved with an image using the 'conv2' function. 

Use the fspecial function to generate a horizontal motion filter with default parameters.

Apply the filter to the 'cameraman.tif' image, and display the results. Use the 'same' argument for 'conv2' so that the output dimensions match the original image.

What is the average pixel intensity value of the resulting image (accurate to two decimal places) ?

%}


img = imread('cameraman.tif');
motion_filter = fspecial('motion');
img_motion_filter = conv2(img, motion_filter, 'same');
meanIntensityValue = mean2(img_motion_filter)

% answer -> 117.53