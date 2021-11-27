%{

Question 1
In the lecture, we demonstrated how our myfft function can be used to analyze frequency content of a signal. If we provide a filter, instead of a signal, to our myfft function, it be used to determine the frequency response of the filter, where the magnitude spectrum plot of the myfft result shows how the filter amplifies or suppresses the frequency content of the signal that it filters.

Let's use our myfft and MagnitudeSpectrumPlot functions to observe the frequency response characteristics of finite impulse response (FIR) band-pass filters created using the fir1 function as presented in the previous section. Recall that FIR filters are not ideal filters, which means they do not entirely suppress frequencies outside of the passband nor perfectly preserve frequencies in the passband. But, the advantage over ideal filters is that they are practical to implement for real world systems.

Using the code below, we create three band-pass FIR filters that all have the same pass-band. The difference is the window size. The first uses a window size of 10, the next 100, and the last 1000. 



%}

Fs = 1000;
freq_range = [100,200];
filt10 = fir1(10,freq_range/(Fs/2));
filt100 = fir1(100,freq_range/(Fs/2));
filt1000 = fir1(1000,freq_range/(Fs/2));

%{

Question 1
In the lecture, we demonstrated how our myfft function can be used to analyze frequency content of a signal. If we provide a filter, instead of a signal, to our myfft function, it be used to determine the frequency response of the filter, where the magnitude spectrum plot of the myfft result shows how the filter amplifies or suppresses the frequency content of the signal that it filters.

Let's use our myfft and MagnitudeSpectrumPlot functions to observe the frequency response characteristics of finite impulse response (FIR) band-pass filters created using the fir1 function as presented in the previous section. Recall that FIR filters are not ideal filters, which means they do not entirely suppress frequencies outside of the passband nor perfectly preserve frequencies in the passband. But, the advantage over ideal filters is that they are practical to implement for real world systems.

Using the code below, we create three band-pass FIR filters that all have the same pass-band. The difference is the window size. The first uses a window size of 10, the next 100, and the last 1000. 

534
Fs = 1000;
freq_range = [100,200];
filt10 = fir1(10,freq_range/(Fs/2));
filt100 = fir1(100,freq_range/(Fs/2));
filt1000 = fir1(1000,freq_range/(Fs/2));
1. Use your myfft function for each filter, treating the filters identically to signals.

2. Use your MagnitudeSpectrumPlot function to display the magnitude spectrum of each result. 

You should observe that increasing window size should improve filter characteristics, making the FIR filter have closer and closer characteristics to an ideal passband of 100-200 Hz. Choosing a window size is always a balancing act  that depends on application specific requirements. Larger windows improve filter quality, but require more time and complexity in the system implementing the filter. 

For the filter with a window size of 10 (filt10), what is the magnitude of the filter response for the frequency closest to 90 Hz (which is outside the pass-band and thus ideally should be 0)? 

Hint: you can find the index to the frequency closest to 90 Hz by doing: 

%}

[~,i] = min(abs(f-90));

% where f is the frequency vector output from myfft. The magnitude of the frequency response is the magnitude of the Fourier Transform of the filter at that frequency.

% answer - 0.7722
% Dropping from 1 in the passband to just under .8 outside the passband is not a very selective filter. It is suppressing frequencies outside the passband (77% at 90 Hz), but not very much. This filter's characteristics are far from ideal.




% Question 2
% For the filter with a window size of 100, what is the magnitude of the filter response for the frequency closest to 90 Hz (which is outside the pass-band)?
% 0.0594
% This is much better than our results with a window size of 10. While ideally this number would be zero as we are outside the passband, we are getting pretty close.  This is a reasonable quality filter.



% 3.
% Question 3
% For the filter with a window size of 1000, what is the magnitude of the filter response for the frequency closest to 90 Hz (which is outside the pass-band)? 
% 6.8140e-04
% We have near ideal frequency cutoffs, with near zero values just outside the passband. This is a high quality filter!




Fs = 1000;
freq_range = [100,200];

filt10 = fir1(10, freq_range/(Fs/2));
filt100 = fir1(100, freq_range/(Fs/2));
filt1000 = fir1(1000, freq_range/(Fs/2));

[yfft, f] = myfft(filt10, Fs);
MagnitudeSpectrumPlot(yfft, f, '*');
% check Y near X = 90
[~,i] = min(abs(f-90));
abs(yfft(i))

[yfft, f] = myfft(filt100, Fs);
MagnitudeSpectrumPlot(yfft, f, '*');
% check Y near X = 90
[~,i] = min(abs(f-90));
abs(yfft(i))

[yfft, f] = myfft(filt1000, Fs);
MagnitudeSpectrumPlot(yfft, f, '*');
% check Y near X = 90
[~,i] = min(abs(f-90));
abs(yfft(i))

% Answer
% 1) 0.7722
% 2) 0.0594
% 3) 6.8140e-04