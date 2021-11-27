%{
Spectrogram
Output Use the spectrogram function to visualize the frequency content as a function of time in the 'gong' sound.
Use a window size of 256 to obtain analysis windows of length 256/Fs~=30 milliseconds.
Use default values for the NOVERLAP and NFFT variables.
Output s, f, and t, the spectrogram matrix, frequency vector, and time vector from the spectrogram function.
Display the log of the magnitude of the transpose of the spectrogram matrix with 'imagesc.'
Listen to the gong sound by loading it into MATLAB Online and running ">>soundsc(y,Fs)." Comparing with t
contains energy across the sound frequency spectrum, and the high frequency energy decays more quickly 

%}

load gong % loads gong sound y and sampling frequency Fs
% can play in MATLAB Online with soundsc(y,Fs)
soundsc(y(1:4*Fs),Fs);
% call spectrogram to get s,f,t
[s,f,t] = spectrogram(y,256,[],[],Fs);
% Use imagesc to display it
imagesc(f,t,log(abs(s')));



colorbar
axis xy
xlabel('Frequency (Hz)')
ylabel('Time (s)')

