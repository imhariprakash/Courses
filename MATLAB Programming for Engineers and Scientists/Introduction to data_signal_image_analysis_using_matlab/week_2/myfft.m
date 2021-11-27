%{
myfft

Write your own myfft function identically to the one implemented in the lecture. It takes as input a [Nx1] signa
the Fourier Transform as demonstrated in the lecture, as well as the frequency vector f.
The steps are:
Compute the standard FFT
Trim away the redundant part
Compute the frequencies to which each FFT entry corresponds
As an example, the magnitude of a single "impulse" is a vector of all 1's.
Fs = 10;
y = [0 0 0 0 1 0 0 0 0 0]';
[yfft, f] = myfft(y,Fs);
Your function should give the following result
abs(yfft) is a vector of all 1's and f = (0:5)'

%}

function [yfft, f] = myfft(y,Fs)
% compute the standard fft
    yfft = fft(y);
% trim away the redundant part
    yfft = yfft(1:ceil((length(y)+1)/2));  
% compute the frequencies to which each fft entry corresponds
    samplenum = [0:(length(yfft)-1)]';
    f = samplenum*Fs/length(y); % convert sample numbers to hertz (1/s)
end


%{

% Even length y
Fs = 10;
y = [0 0 0 0 1 0 0 0 0 0]'; 
[yfft, f] = myfft(y,Fs);
abs(yfft')


% Odd length y
Fs = 10;
y = [0 0 0 0 1 0 0 0 0]';
[yfft, f] = myfft(y,Fs);
abs(yfft') % All 1's (constant)
f' % you should get 0:10/9:40/9

%}
