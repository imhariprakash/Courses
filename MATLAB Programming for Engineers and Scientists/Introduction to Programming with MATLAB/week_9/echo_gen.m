% Echo Generator
% 
% Write a function called echo_gen that adds an echo effect to an audio recording. An echo is the original signal d
% the echo and then add it to the original signal with the correct offset. The function is to be called like this:
% output = echo_gen(input, fs, delay, amp);
% where input is a column vector with values between -1 and 1 representing a time series of digitized sound data.
% specifies how many samples we have in the data each second. For example, an audio CD uses 44,100 samples
% echo in seconds. That is, the echo should start after delay seconds have passed from the start of the audio sign
% typically this is a value less than 1 because the echo is not as loud, your function should work if amp is greater t
% The output of the function is a column vector containing the original sound with the echo superimposed. The out
% zero (round to the nearest number of points needed to get the delay, as opposed to floor or ceil). A sound record
% values to be outside of this range, you will need to scale the entire vector, so that all values are within the range
% MATLAB has several sample audio files included that you can try: splat, gong, and handel are a few examples
% load gong % loads two variables, y and Fs
% sound(y, Fs) % Outputs sound
% To hear the sound you will need to use desktop MATLAB or MATLAB Online.
% (Note that we are assuming mono audiofiles. You can load your own audio files using the audioread function (htt
% MATLAB. If the audio data has two columns, it is a stereo file, so use only one column of the data when testing y
%% my code

function output = echo_gen(input,fs,delay,amp)
del=round(fs*delay);
zero_pad=zeros(del,1);
echo_sig=[zero_pad;input*amp]; %column vector
input=[input;zero_pad]; %colun vector
output=echo_sig+input;
p=max(abs(output));
if p>1
    output=output ./p;
end
end



%% running code
% Load splat which adds y and Fs to the workspace
load splat
% Call echo_gen to create the new audio data
output = echo_gen(y, Fs, 0.25, 0.6);
% The time between points is 1/Fs;
dt = 1/Fs;
% Plot the original sound
plot(0:dt:dt*(length(y)-1), y)
% Plot the new data to see visualize the echo
figure
plot(0:dt:dt*(length(output)-1), output)
% sound (output, Fs) % Uncomment in MATLAB to listen to the new sound data

