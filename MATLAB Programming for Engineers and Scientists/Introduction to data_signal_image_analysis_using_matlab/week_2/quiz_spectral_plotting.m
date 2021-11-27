%{
After loading the attached '.mat' file, you will have a [220500 x 1] sound signal vector 'crickets' with sampling frequency 'Fs'. When played using soundsc, it sounds quite a bit like crickets at night. But this signal is encoded with a special secret message in its magnitude spectrum.

Implement the MagnitudeSpectrumPlot function. If you have implemented myfft and MagnitudeSpectrumPlot correctly, when viewing the MagnitudeSpectrum plot of the Fourier Transform with the third input argument col='*', letters are clearly revealed. What are they?

download crickets mat file

%}

load crickets.mat;
soundsc(crickets, Fs);
[yfft, f] = myfft(crickets, Fs);
MagnitudeSpectrumPlot(yfft, f, '*');

% answer -> VU