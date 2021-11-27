%{
A color image is formed by creating a 3-channel image matrix, where the 3 channels represent the red, green, and blue intensities for each pixel. In the attached '.mat' file, you will find three single channel 256x256 image matrices R, G, and B.

Use R, G, and B to construct a 256x256x3 color image matix with R forming the first channel, G the second, and B the third. Display the result using the 'imagesc' function. What is the secret message displayed in the resulting color image?


RGB.mat
%}

load RGB.mat;

%img = zeros(256,256,3);
%img(:,:,1) = R;
%img(:,:,2) = G;
%img(:,:,3) = B;
img = cat(3, R, G, B);

figure;
imagesc(img);


% answer -> Color Images In MATLAB