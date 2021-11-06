% Edge Detection
% Automatically detecting edges in images is an important task in image processing. An edge detector takes an in
% original image are highlighted by gray/white colors while other pixels are black. For each 3x3-pixel subset , of 
% center pixel of as a weighted sum of all the values in . One common technique is called the Sobel operator 
% where and can be defined as,

% sx=[-1 0 1;-2 0 2;-1 0 1]:A,sy=[1 2 1;0 0 0;-1 -2 -1]:A

% Note that the colon in linear algebra means double dot product which is different from its use in MATLAB. So th
% weighted sum of the values of the neighboring pixels in the original image using the weights specified in the 3x3
% and its top and bottom neighbors are not used (weights are zero), while the top right neighbor has a weight of 1 
% the root sum squared and .
% Create a function called edgy that takes an original image input, and produces a processed image. Both the inpu
% of uint8 values.
% Note that the output has two fewer rows and columns than the input since the pixels in the first and last columns
% computation.
% Here is an example input and output (click here for the image (https://lcms-files.mathworks.com/content/file/7540
% versionId=QCBjo05K.y_4OF0DYGcBVICG50OorXg2)):


function edg=edgy(cc)
cc=uint8(cc);cc=double(cc);
[i,j]=size(cc);
edg=zeros(i,j);
mx=[-1,0,1;-2,0,2;-1,0,1];
my=[1,2,1;0,0,0;-1,-2,-1];
for x=1:i-2
    for y=1:j-2
        sx=sum(sum(mx.*cc(x:x+2,y:y+2)));
        sy=sum(sum(my.*cc(x:x+2,y:y+2)));
        edg(x,y)=sqrt((sx^2)+(sy^2));
    end
end
edg=edg(1:end-2,1:end-2);
edg=uint8(edg);
end

%% calling code

cc = imread('CocaCola.png');
figure
imshow(cc);
edg = edgy(cc);
figure
imshow(edg);

