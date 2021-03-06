%{

https://lcms-files.mathworks.com/content/images/8f20b947-ef3f-41df-b2b2-7324125cad41.png

output image

myifft
Write your own 'myifft' function identically to the one implemented in the lecture. It takes as input a [Nx1] Fou
frequency Fs. It outputs y, the time domain signal corresponding to the input Fourier transform vector.
Using it in the example code, you should see exactly this output:

%}

function y = myifft(yfft, f, Fs)
% Replace redundant part of the fft that we trimmed away:
% if the last frequency in f equals Fs/2, 
    if (f(end) == Fs/2)
        % then we need to append the conjugate of the mirrored entries in yfft from 2 to length of yfft minus 1
        y = [yfft; conj(flipud(yfft(2:end-1)))];
    else
        % then we need to append the conjugate of the mirrored entries in yfft from 2 to length of yfft
        y = [yfft; conj(flipud(yfft(2:end)))];
    end
% Perform ifft
    y = ifft(y);
end


%{

% Even length y
Fs = 10;
yfft = [0 0 1 0 0 0 0 0 0 0]'; % magnitude spectrum with single frequency corresponds to a single cosine
f = 0:5;
y = myifft(yfft,Fs,f);
t = 0:1/Fs:(length(y)-1)/Fs;
plot(t,y)
yEven = y' % = [0.1053    0.0831    0.0258   -0.0423   -0.0926 ...]

% Odd length y
Fs = 10;
yfft = [0 0 1 0 0 0 0 0 0]';
f = 0:10/9:40/9;
y = myifft(yfft,Fs,f);
t = 0:1/Fs:(length(y)-1)/Fs;
figure
plot(t,y)
yOdd = y' % = [ 0.1176    0.0869    0.0109   -0.0709   -0.1156 ...]

%}

