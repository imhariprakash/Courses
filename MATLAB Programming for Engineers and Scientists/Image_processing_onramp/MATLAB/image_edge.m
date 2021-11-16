originalimage=imread('cameraman.tif');
subplot(2,3,1);
imshow(originalimage);
title('Original Image');

r=edge(originalimage,'roberts');
subplot(2,3,2);
imshow(r);
title('Roberts operator');

p=edge(originalimage,'prewitt');
subplot(2,3,3);
imshow(p);
title('Prewitt operator');

s=edge(originalimage,'sobel');
subplot(2,3,4);
imshow(s);
title('Sobel operator');

c=edge(originalimage,'canny');
subplot(2,3,5);
imshow(c);
title('Canny edge detector');


