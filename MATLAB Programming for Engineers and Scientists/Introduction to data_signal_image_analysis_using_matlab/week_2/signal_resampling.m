%{

Signal resampling

Write a Matlab function SignalResample that takes as input a [1 x N] signal x and sampling frequency xFs,
interpolation with interp1 to create and output signal y, a resampled version of x with sampling rate yFs. The
Find the total time duration T for the signal x with sampling frequency xFs
Using T, define a time vector tx, which is the same size as x. Each entry in tx should contain the tim
Using T, define the new time vector, ty for our resampled time. The entries in ty should range from 0
Use 'interp1' to create y by resampling x to the new sampling rate using linear interpolation.
For example, if
x = [1:0.5:5.5];
xFs = 2;
yFs = 4;
 the resampled x-values will be [1 1.25 1.5 1.75 2 2.25 2.5 2.75 3 3.25 3.5 3.27 4 4.25 4
And if
x = [1:0.5:5.5];
xFs = 2;
yFs = 1;
 the resampled x-values will be [1 2 3 4 5]

%}

function y = SignalResample(x, xFs, yFs)

% Find the total time duration 'T'
T = (length(x) - 1) / xFs;

% Using 'T', define a time vector 'tx'
tx = [0:1/xFs:T];

% Using 'T', define the new time vector, 'ty' for our resampled time. 
ty = [0:1/yFs:T];

% Use interp1 to create y by resampling x
y = interp1(tx,x,ty,'linear');

end


%{
x = [1:0.5:5.5];
xFs = 2;
yFs = 4;
y = SignalResample(x, xFs, yFs)

x = [1:0.5:5.5];
xFs = 2;
yFs = 1;
y = SignalResample(x, xFs, yFs)
%}