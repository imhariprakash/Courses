% Text File I/O
% 
% Write a function called char_counter that counts the number of a certain character in a text file. The function tak
% character, the char it counts in the file. The function returns charnum, the number of characters found. If the file
% -1. As an example, consider the following run. The file "simple.txt" contains a single line: "This file should have e
% charnum = char_counter('simple.txt','a')
% charnum =
%  3
% You may find it helpful to download the files for testing and dubugging in MATLAB

function charnum=char_counter(file,char)
file=fopen(file,'rt');
if file<0 || ~ischar(char)
 charnum=-1;
 return;
end
cout=0;
line=fgets(file);
while ischar(line)
 cout=cout+count(line,char);
 line=fgets(file);
end
charnum=cout;
end


% type('simple.txt')
% charnum = char_counter('simple.txt','a')
% charnum = char_counter('Frankenstein-by-Shelley.txt','?')
