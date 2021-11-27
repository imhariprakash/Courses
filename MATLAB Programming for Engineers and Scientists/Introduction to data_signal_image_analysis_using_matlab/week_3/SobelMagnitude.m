%{

Edge strength
Sobel filters are useful for image edge detection. Horizontal and vertical Sobel filters provide positive filter re
negative response for similarly oriented dark-to-bright edge transitions. Often, we only want to know the mag
pixel.
Write a function called SobelMagnitude, which takes as input an image img, and outputs edge_mag, the m
computing the square root of the sum of the squared horizontal and vertical filter response results.
When running the example code, your output should look identical to this:

%}

function edge_mag = SobelMagnitude(img)
 % Use fspecial to generate the horizontal and vertical Sobel filters (sh and sv)
    sh = fspecial('sobel');
    sv = sh';
% Apply both filters to the image to generate img_sh and img_sv
    img_sh = conv2(img, sh, 'same');
    img_sv = conv2(img, sv, 'same');
% Compute edge_mag as the square root of the sum of the squared img_sh and img_sv results
    edge_mag = sqrt(img_sh.*img_sh + img_sv.*img_sv);
end


%{
img = imread('cameraman.tif');
edge_mag = SobelMagnitude(img);
imagesc(img); colormap(gray);
figure; imagesc(edge_mag); colormap(gray);
%}