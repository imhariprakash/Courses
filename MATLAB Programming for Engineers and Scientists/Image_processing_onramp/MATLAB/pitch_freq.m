recObj = audiorecorder
disp('Start speaking.')
recordblocking(recObj, 2);
disp('End of Recording.');
play(recObj);
y = getaudiodata(recObj);
plot(y);

% load mtlb
Fs=7418;

segmentlen = 100;
noverlap = 90;
NFFT = 128;

spectrogram(y,segmentlen,noverlap,NFFT,Fs,'yaxis')
dt = 1/Fs;
I0 = round(0.1/dt);
Iend = round(0.25/dt);
x = y(I0:Iend);
c = cceps(x);
t = 0:dt:length(x)*dt-dt;

trng = t(t>=2e-3 & t<=10e-3);
crng = c(t>=2e-3 & t<=10e-3);

[~,I] = max(crng);

fprintf('Complex cepstrum F0 estimate is %3.2f Hz.\n',1/trng(I))