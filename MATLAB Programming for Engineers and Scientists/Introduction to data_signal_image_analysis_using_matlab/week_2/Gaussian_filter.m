%{
Gaussian filter

Write a function GaussianFilter that takes as input a [1xN] vector x, which represents a signal, and a scalar
standard deviation sigma. Choose W, the size of the filter, to be 6*sigma, rounding up using 'ceil' to ensure
y. Use the 'same' argument with 'conv' to ensure the output y is the same size as the input x.
The steps are:
Compute W by rounding up 6*sigma
Use fspecial to create our Gaussian filter
Create output signal by convolving the signal with the filter
The Gaussian filter smears out non-zero amplitudes in x. As an example, when x contains only 1 non-zero e
entries in the array:
x = [0 0 0 1 0 0 0];
sigma = 1.5;
y = GaussianFilter(x, sigma)
Gives the result
y = [0.0361 0.1096 0.2134 0.2666 0.2134 0.1096 0.0361]

%}

function y = GaussianFilter(x, sigma)
% Compute W by rounding up 6*sigma
    W = ceil(6*sigma);
% Use fspecial to create our Gaussian filter
    gaussianfilter = fspecial('gaussian',[1,W],sigma);
% Convolve the signal with the filter
    y = conv(x,gaussianfilter,'same');
end


%{
x = [0 0 0 1 0 0 0]; 
sigma = 1.5;
y = GaussianFilter(x, sigma)
%}