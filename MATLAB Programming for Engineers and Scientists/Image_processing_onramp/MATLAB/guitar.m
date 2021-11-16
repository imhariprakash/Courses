fs = 44100; 
% the signal is known to have been recorded at this rate
bass_guitar = wavread('bass.wav', 5*fs); 
%read in first 5 seconds; fs = 44100Hz
ft = fft(bass_guitar);
mag_ft = abs(ft);
%%The following plot will be difficult to interpret as most of the
%%frequency content is in the low frequency...
%%region, as expected for a bass guitar. The plot after this one will just show the low frequency content
subplot(2,1,1);
plot(mag_ft) 
% plot magnitudes versus frequency bins
ylabel('Magnitude/Amplitude')
xlabel('Bin Number')
low_freq_mags = mag_ft(1:2000); 
%the magnitudes of the low freq content are stored in a new variable
%Note: 2000 in the above command corresponds to 2000/length(mag_ft)*fs = 400Hz
subplot(2,1,2);
plot(low_freq_mags);
ylabel('Magnitude/Amplitude')
xlabel('Bin Number')


figure(2)
N = length(mag_ft);
freq_scale = 0: fs/(N-1) : fs;
subplot(2,1,1);
plot(freq_scale, mag_ft);
ylabel('Magnitude/Amplitude')
xlabel('Frequency (Hz)')
low_mag_freq_scale = freq_scale(1:length(low_freq_mags));
subplot(2,1,2);
plot(low_mag_freq_scale, low_freq_mags);
ylabel('Magnitude/Amplitude')
xlabel('Frequency (Hz)')
