% Image blur
% Write a function called blur that blurs the input image. The function is to be called like this:
% output = blur(img,w);
% where img, the input image is a two-dimensional matrix of grayscale pixel values between 0 and 255. Blurring is
% every pixel. Specifically, the output pixel value is the mean of the pixels in a square submatrix of size 2w+1 wher
% use a 3x3 matrix, that is, we average all the neighboring pixels of the given pixel and itself. Only use valid pixels
% example, the blurred value corresponding to w = 1 at index (1,1) would be the mean of of elements (1,1), (1, 2),
% uint8.
% You can download the test image here (https://lcms-files.mathworks.com/content/file/686b475c-bd78-497d-b971
% versionId=ZUe0hS9J3ZIxKapgDPNMdw Uvjotsiaf) to use in MATLAB


function output=blur(img,w)
img=double(img);
[row col]=size(img);
output=zeros(row,col);
for i=1:row
    for j=1:col
        r1=i-w;
        r2=i+w;
        c1=j-w;
        c2=j+w;
        if r2 > row
            r2=row;
        end
        if c2 > col
            c2=col;
        end
        if r1 < 1 
            r1=1;
        end
        if c1 < 1
            c1=1;
        end
        mat=img(r1:r2, c1:c2);
        output(i,j)=mean(mat(:));
    end
end
output=uint8(output);
end

% Code to call your function 
% img = imread('vandy.png');
% output = blur(img,2);
% imshow(output);