% greyscale images

img = imread('tire.tif');

subplot(2,2,1);
imagesc(img);
colormap(gray);
title('tire.tif');
xlabel('Columns');
ylabel('Rows');
axis equal;
axis tight;

subplot(2,2,2);
imhist(img);
title('Histogram of grayscale intensity values');
%xlabel('Pixel intensity');
ylabel('Total pixel count');
axis tight;

subplot(2,2,3);
imgeq = histeq(img);
imagesc(imgeq);
axis equal;
axis tight;
title('Histogram equalized image');

subplot(2,2,4);
[pixelCount, grayLevels] = imhist(imgeq);
bar(grayLevels, pixelCount);
title('Histogram of grayscale intensity values');
xlabel('Pixel intensity');
ylabel('Total pixel count');
axis tight;



% color image

img = imread('peppers.png');

size(img)

subplot(2,2,1);
imagesc(img);
axis tight;
axis equal;

subplot(2,2,2);
imhist(img(:,:,1));
title('Red Channel');
axis tight;

subplot(2,2,3);
imhist(img(:,:,2));
title('Green Channel');
axis tight;

subplot(2,2,4);
imhist(img(:,:,3));
title('Blue Channel');
axis tight;



% color image hsv


img = imread('peppers.png');
imghsv = rgb2hsv(img);

size(imghsv)

subplot(3,2,1);
imagesc(imghsv(:,:,1));
axis tight; axis equal;
cmap = hsv2rgb([[0:1/255:1]', ones(256,2)]);
colormap(gca, cmap);
title('Hue Channel');

subplot(3,2,2);
imhist(round(imghsv(:,:,1)*255)+1, cmap);
axis tight;

ax3 = subplot(3,2,3);
imagesc(imghsv(:,:,2));
colormap(ax3, gray);
axis tight; axis equal;
title('Saturation Channel');

subplot(3,2,4);
imhist(imghsv(:,:,2));
axis tight;

ax5 = subplot(3,2,5);
imagesc(imghsv(:,:,3));
colormap(ax5, gray);
axis tight; axis equal;
title('Value Channel');

subplot(3,2,6);
imhist(imghsv(:,:,3));
axis tight;



% hue shifted image


img = imread('peppers.png');
imghsv = rgb2hsv(img);

subplot(2,2,1);
imagesc(img);

subplot(2,2,2);
hsvbright = imghsv;
hsvbright(:,:,3) = hsvbright(:,:,3).^0.5;
imagesc(hsv2rgb(hsvbright));
title('Intensity brightened image');

subplot(2,2,3);
hsvsat = imghsv;
hsvsat(:,:,2) = hsvsat(:,:,2).^0.5;
imagesc(hsv2rgb(hsvsat));
title('Color saturated image');

subplot(2,2,4);
hsvhue = imghsv;
hsvhue(:,:,1) = mod(hsvhue(:,:,1)-0.1, 1);
imagesc(hsv2rgb(hsvhue));
title('Hue shifted image');