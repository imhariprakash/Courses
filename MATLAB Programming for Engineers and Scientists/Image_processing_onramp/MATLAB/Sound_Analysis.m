%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%   Sound Analysis with MATLAB Implementation    %
%                                                %
% Author: M.Sc. Eng. Hristo Zhivomirov  04/01/14 %
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

clear, clc, close all

% get a section of the sound file
[x, fs] = audioread('track.wav');   % load an audio file
x = x(:, 1);                        % get the first channel
N = length(x);                      % signal length
t = (0:N-1)/fs;                     % time vector

% plot the signal waveform
figure(1)
plot(t, x, 'r')
xlim([0 max(t)])
ylim([-1.1*max(abs(x)) 1.1*max(abs(x))])
grid on
set(gca, 'FontName', 'Times New Roman', 'FontSize', 14)
xlabel('Time, s')
ylabel('Amplitude')
title('The signal in the time domain')

% plot the signal spectrogram
figure(2)
spectrogram(x, 1024, 3/4*1024, [], fs, 'yaxis')
box on
set(gca, 'FontName', 'Times New Roman', 'FontSize', 14)
xlabel('Time, s')
ylabel('Frequency, Hz')
title('Spectrogram of the signal')

h = colorbar;
set(h, 'FontName', 'Times New Roman', 'FontSize', 14)
ylabel(h, 'Magnitude, dB')

% spectral analysis
w = hanning(N, 'periodic');
[X, f] = periodogram(x, w, N, fs, 'power');
X = 20*log10(sqrt(X)*sqrt(2));

% plot the signal spectrum
figure(3)
semilogx(f, X, 'r')
xlim([0 max(f)])
grid on
set(gca, 'FontName', 'Times New Roman', 'FontSize', 14)
title('Amplitude spectrum of the signal')
xlabel('Frequency, Hz')
ylabel('Magnitude, dB')

% plot the signal histogram
figure(4)
hist(x)
xlim([-1.1*max(abs(x)) 1.1*max(abs(x))])
grid on
set(gca, 'FontName', 'Times New Roman', 'FontSize', 14)
xlabel('Signal amplitude')
ylabel('Number of samples')
title('Probability distribution of the signal')

% autocorrelation function estimation
[Rx, lags] = xcorr(x, 'coeff');
d = lags/fs;

% plot the signal autocorrelation function
figure(5)
plot(d, Rx, 'r')
grid on
xlim([-max(d) max(d)])
set(gca, 'FontName', 'Times New Roman', 'FontSize', 14)
xlabel('Delay, s')
ylabel('Autocorrelation coefficient')
title('Autocorrelation of the signal')
line([-max(abs(d)) max(abs(d))], [0.05 0.05],...
     'Color', 'k', 'LineWidth', 2, 'LineStyle', '--')

% compute and display the minimum and maximum values
maxval = max(x);
minval = min(x);
disp(['Max value = ' num2str(maxval)])
disp(['Min value = ' num2str(minval)])
 
% compute and display the the DC and RMS values
u = mean(x);
s = std(x);
disp(['Mean value = ' num2str(u)])
disp(['RMS value = ' num2str(s)])

% compute and display the dynamic range
D = 20*log10(maxval/min(abs(nonzeros(x))));
disp(['Dynamic range D = ' num2str(D) ' dB'])

% compute and display the crest factor
Q = 20*log10(maxval/s);
disp(['Crest factor Q = ' num2str(Q) ' dB'])

% compute and display the autocorrelation time
ind = find(Rx>0.05, 1, 'last');
RT = (ind-N)/fs;
disp(['Autocorrelation time = ' num2str(RT) ' s'])

commandwindow