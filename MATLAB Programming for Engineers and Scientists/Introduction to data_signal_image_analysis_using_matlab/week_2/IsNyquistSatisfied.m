%{

Nyquist

Write a function called IsNyquistSatisfied. The goal of the function is to confirm a proposed sampling rate, F
known to contain no frequency greater than fmax. The function takes as input fmax and Fs, and it outputs a
second output, Fs_min, contains the Nyquist sampling rate.

%}

function [y,Fs_min] = IsNyquistSatisfied(fmax,Fs)
    Fs_min = 2*fmax;
    if (Fs > Fs_min)
        y = true;
    else
        y = false;
    end
end


%{

fmax = 16000;
Fs = 28800;
[y,Fs_min] = IsNyquistSatisfied(fmax,Fs) % false, with Fs_min=32000

fmax = 16000;
Fs = 44100;
[y,Fs_min] = IsNyquistSatisfied(fmax,Fs) % true, with Fs_min=32000

%}
