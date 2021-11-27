%{

Making waves
Musical chords are played on a guitar by strumming up to 6 strings simultaneously with one hand, while usin
shorten the strings by different amounts to modify the notes each string plays. An E-major chord is played by
strings reverberate with the following fundamental frequencies:
Note | Frequency
1: E | 330 Hz
2: B | 247 Hz
3: G# | 208 Hz
4: E | 165 Hz
5: B | 123 Hz
6: E | 82 Hz
Plucking a guitar string also generates higher frequency harmonics in addition to the fundamental frequency
sounds, however, in this exercise, we will simulate a simple "pure tone" guitar.
Your task is to write a script that creates a sound signal by combining the 6 pure tones.
create a row vector t that spans [0, 3) seconds using a sampling frequency, Fs = 44100 Hz
create an output signal y that is the sum of cosines (amplitude = 1, phase = 0) with the frequencies 


%}

% Creates an audio signal by combining 6 pure tones

% Define T, Fs, and f (vector of sound frequencies)
T = 3;
Fs = 44100; 
% sampling frequency
f = [330 247 208 165 123 82]; % Hz

% Compute time vector t (spans [0,3) seconds)
t = [0:1/Fs:T-(1/Fs)];

% Use a for-loop to construct y as a sum of cosines
y = 0;
for i = 1 : length(f)
    a = 2*pi*f(i);
    y = y + cos(a*t); % amplitude = 1, phase = 0
end
figure(1);
plot(t,y);
xlabel('t (seconds)');
ylabel('y(t)');

duration = length(y) / Fs;
fprintf("The audio signal will last for %.1f seconds.\n", duration);
soundsc(y,Fs);