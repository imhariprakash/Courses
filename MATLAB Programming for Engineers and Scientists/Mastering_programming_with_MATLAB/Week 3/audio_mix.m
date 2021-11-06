% Audio Mixing
% Consider a multi-track audio recording: a uint16 matrix of N columns where each column represents one track,
% input range is between 0 and 65535, a value that a 16-bit analog digital converter would provide. The task is to w
% weighted sum of them. Specifically, write a function called mixit that takes two input arguments. The first is a K
% K is the number of samples per track. The second input argument is a vector of N double scalars representing th
% column vector of doubles representing a single-track audio recording obtained by mixing the individual tracks ac
% processing takes place, the audio data must be converted to standard interval of [-1 1]. That is, uint16 0 needs
% expected to be in the same range. If any element of the final mixed audio is outside of this range, the output nee
% the output vector. If it is greater than 1, you need to divide the entire vector with that value.
% Here is an example:
% >> A = 2.^(0:16)';
% >> A = [A flip(A)] - 1;
% >> A = uint16(A)
% >> format long
% A =
%  17x2 uint16 matrix
%  0 65535
%  1 32767
%  3 16383
%  7 8191
%  15 4095
%  31 2047
%  63 1023
%  127 511
%  255 255
%  511 127
%  1023 63
%  2047 31
%  4095 15
%  8191 7
%  16383 3
%  32767 1
%  65535 0
% >> mixit(A,[1 1])
% ans =
%  0
%  -0.503913879277201
%  -0.755847750865052
%  -0.881768550557478
%  -0.944636678200692
%  -0.975886197616301
% -0.991141868512111
% 9/27/21, 9:24 PM MathWorks Learning Tool
% https://learningtool.mathworks.com/launch 2/5
%  0.991141868512111
%  -0.998031526336025
%  -1.000000000000000
%  -0.998031526336025
%  -0.991141868512111
%  -0.975886197616301
%  -0.944636678200692
%  -0.881768550557478
%  -0.755847750865052
%  -0.503913879277201
%  0
% >> mixit(A,[1 0])
% ans =
%  -1.000000000000000
%  -0.999969481956207
%  -0.999908445868620
%  -0.999786373693446
%  -0.999542229343099
%  -0.999053940642405
%  -0.998077363241016
%  -0.996124208438239
%  -0.992217898832685
%  -0.984405279621576
%  -0.968780041199359
%  -0.937529564354925
%  -0.875028610666056
%  -0.750026703288319
%  -0.500022888532845
%  -0.000015259021897
%  1.000000000000000
% >> mixit(A,[0 1])
% ans =
%  1.000000000000000
%  -0.000015259021897
%  -0.500022888532845
%  -0.750026703288319
%  -0.875028610666056
%  -0.937529564354925
%  -0.968780041199359
%  -0.984405279621576
%  -0.992217898832685
%  -0.996124208438239
%  -0.998077363241016
%  -0.999053940642405
%  -0.999542229343099
%  -0.999786373693446
%  -0.999908445868620
% -0.999969481956207
% 9/27/21, 9:24 PM MathWorks Learning Tool
% https://learningtool.mathworks.com/launch 3/5
%  0.999969481956207
%  -1.000000000000000
% >> mixit(A,[.5 .5])
% ans =
%  0
%  -0.499992370489052
%  -0.749965667200732
%  -0.874906538490883
%  -0.937285420004578
%  -0.968291752498665
%  -0.983428702220188
%  -0.990264744029908
%  -0.992217898832685
%  -0.990264744029908
%  -0.983428702220188
%  -0.968291752498665
%  -0.937285420004578
%  -0.874906538490883
%  -0.749965667200732
%  -0.499992370489052
%  0
%  
% If you want to have some fun with real music, try this in MATLAB (not the grader, as it will not play sound). Don't 
% files.mathworks.com/content/file/c8e87170-26f9-4983-a293-3f6b18204493/music.mat?versionId=SqNANElbFpA
% Dodapod (https://www.telefunken-elektroakustik.com/live-from-the-lab-season-4) and hit a key after each music 
% 
% 
% If you want to have some fun with real music, try this in MATLAB (not the grader, as it will not play sound). Don't 
% files.mathworks.com/content/file/c8e87170-26f9-4983-a293-3f6b18204493/music.mat?versionId=SqNANElbFpA
% Dodapod (https://www.telefunken-elektroakustik.com/live-from-the-lab-season-4) and hit a key after each music 
% load music
% fs = 24000;
% x1 = mixit(music,ones(1,15));
% sound(x1,fs); % you need to do this in MATLAB not in the grader
% pause
% x2 = mixit(music,[1 1 1 1 1 1 1 1 1 1 1 0 0 0 0]);
% sound(x2,fs);
% pause
% x3 = mixit(music,~[1 1 1 1 1 1 1 1 1 1 1 0 0 0 0]);
% sound(x3,fs);
% pause
% x4 = mixit(music,~[1 1 0 0 0 0 0 0 0 0 0 1 1 1 1]);
% sound(x4,fs);
% pause
% x5 = mixit(music,[1 1 0 0 0 0 0 0 0 0 0 1 1 1 1]);
% sound(x5,fs);
% If you want to compare the output of your function with that of the reference solution, below are the mat files stor
% Compare a few specific elements of the vectors or use isequal, max and min to see whether there are difference
% x1.mat (https://lcms-files.mathworks.com/content/file/d803524e-2d72-46aa-9160-7982c8eecf16/x1.mat?version
% x2.mat (https://lcms-files.mathworks.com/content/file/0978df47-b57c-4b33-beb7-3b932f6248fa/x2.mat?versionId
% 9/27/21, 9:25 PM MathWorks Learning Tool
% https://learningtool.mathworks.com/launch 4/5
% Function 
%  Reset  MATLAB Documentation (https://www.mathworks.com/help/)
% Code to call your function  Reset
% Assessment: Submit 
%  Run Function 
% 
% x3.mat (https://lcms-files.mathworks.com/content/file/16f433ad-a0ff-4c0e-bb33-782b2724c69e/x3.mat?versionId
% x4.mat (https://lcms-files.mathworks.com/content/file/a59fc65e-2350-417f-aeee-9cdb8e4df3a8/x4.mat?versionId
% x5 mat (https://lcms files mathworks com/content/file/499f5764 13b1 4161 b79e b4afc1afc93c/x5 mat?versionId


function ans=mixit(A,N)
if size(A,2)~=length(N)
    ans=[];
else
A=double(A);
A=2*(A/65535)-1;
ans=A*N(:);
if max(abs(ans))>1
    ans=ans/max(abs(ans));
end
end
end

%% running code
% %% running code
% A = 2.^(0:16)';
% A = [A flip(A)] - 1;
% A = uint16(A);
% format long
% mixit(A,[1 1])
