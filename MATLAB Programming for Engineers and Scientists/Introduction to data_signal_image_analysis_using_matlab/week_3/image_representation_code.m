r = 10;
c = 15;
img = zeros(r,c);
for i = 1 : r
    for j = 1 : c
        img(i,j) = i*j;
    end
end
img

figure(1);
imagesc(img);
colorbar;
xlabel('columns');
ylabel('rows');

figure(2);
imagesc(img);
colorbar;
colormap(gray);
xlabel('columns');
ylabel('rows');



img = imread('cameraman.tif');   % requires Image Processing Toolbox
imagesc(img);
colormap(gray);
axis equal;
img(40:75,100:135) = 127;
imagesc(img);
axis equal;
imwrite(img, 'cameraman_anonymized.jpeg');

