rgb = imread('peppers.png');
subplot(1,2,1);
imshow(rgb)
bytes_in_memory_peppers = numel(rgb)
imwrite(rgb,'peppers.jpg');
info = imfinfo('peppers.jpg');
bytes_on_disk_peppers_jpg = info.FileSize
compression_ratio_peppers_jpg = bytes_in_memory_peppers / ...
    bytes_on_disk_peppers_jpg
subplot(1,2,2);
imshow('peppers.jpg')

figure()
subplot(1,2,1)
imshow('peppers.png')
limits = [232 276 215 248];
axis(limits)
title('Original')

subplot(1,2,2)
imshow('peppers.jpg')
axis(limits)
title('JPEG compressed')