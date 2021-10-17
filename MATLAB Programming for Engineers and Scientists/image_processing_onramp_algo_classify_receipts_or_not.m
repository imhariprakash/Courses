function isReceipt = classifyImage(I)
    % This function processes an image using the algorithm developed in
    % previous chapters and classifies the image as receipt or non-receipt
    
    % Processing
    gs = im2gray(I);
    gs = imadjust(gs);
    
    H = fspecial("average",3);
    gssmooth = imfilter(gs,H,"replicate");
    
    SE = strel("disk",8);  
    Ibg = imclose(gssmooth, SE);
    Ibgsub =  Ibg - gssmooth;
    Ibw = ~imbinarize(Ibgsub);
    
    SE = strel("rectangle",[3 25]);
    stripes = imopen(Ibw, SE);
    
    signal = sum(stripes,2);  

    % Classification
    minIndices = islocalmin(signal,"MinProminence",70,"ProminenceWindow",25); 
    nMin = nnz(minIndices);
    isReceipt = nMin >= 9;
    
end

ds = imageDatastore("testimages");
nFiles = numel(ds.Files);
isReceipt = false(1,nFiles);
%Do not edit. This code creates the datastore ds, counts the files in the datastore (nFiles), and preallocates the logical array isReceipt.
  
  for k=1:nFiles
I = readimage(ds,k);
isReceipt(k) = classifyImage(I);
end

% Read all images one by one then use Classify algorithm

receiptFiles=ds.Files(isReceipt);  %which images are receipts

%file=files([0 1 1]) -> 2 and 3 images will be in the file variable

montage(receiptFiles);

%displays multiple images at once
