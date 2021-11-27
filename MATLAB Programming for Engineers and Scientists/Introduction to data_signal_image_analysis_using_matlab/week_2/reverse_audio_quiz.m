%{
Download the attached '.mat' file file and load it into MATLAB using 'load'. It contains an audio signal y_rev with sampling frequency Fs. y_rev contains an audio signal that has been reversed. Re-reverse the signal to obtain 'y,' which is a restored version of the original signal. Play 'y' using 'soundsc'. Answer either by (a): typing the second spoken word in the restored audio clip, or (b): typing the index to the location of the maximum value in 'y'
%}

load ReverseAudio.mat;

y = ReverseAudio(y_rev);
soundsc(y, Fs);
[~,index] = max(y);

function signal_rev = ReverseAudio(signal)
    [r,c] = size(signal);
    if (c == 1) % column vector
        signal_rev = flipud(signal);
    end
    if (r == 1) % row vector
        signal_rev = fliplr(signal);
    end
end


% quiz answer -> 143068