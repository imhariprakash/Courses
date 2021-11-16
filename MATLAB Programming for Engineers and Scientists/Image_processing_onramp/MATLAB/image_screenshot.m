url = 'https://blogs.mathworks.com/images/steve/2012/plot_screen_shot.png';
rgb_plot = imread(url);
imwrite(rgb_plot,'plot_screen_shot.jpg')
rgb_plot_compressed = imread('plot_screen_shot.jpg');

subplot(2,2,1)
imshow(rgb_plot)
title('Original image')
limits = [80 105 210 230];
axis(limits);

subplot(2,2,2)
imshow(rgb_plot_compressed)
title('JPEG compressed image')
axis(limits);

subplot(2,2,3)
imshow(rgb_plot)
limits = [345 380 240 265];
axis(limits);

subplot(2,2,4)
imshow(rgb_plot_compressed)
axis(limits);