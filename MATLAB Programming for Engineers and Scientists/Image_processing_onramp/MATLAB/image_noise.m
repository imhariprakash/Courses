originalimag=imread('four.jpg');
originalimage=rgb2gray(originalimag);
subplot(2,2,1);
imshow(originalimage);
title('Original Image');

s=imnoise(originalimage,'speckle');
subplot(2,2,2);
imshow(s);
title('speckle noise');

g=imnoise(originalimage,'gaussian');
subplot(2,2,3);
imshow(g)
title('Gaussian noise');

sp=imnoise(originalimage,'salt & pepper');
subplot(2,2,4);
imshow(sp);
title('Salt & Pepper noise');