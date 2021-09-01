%%Caesar's cypher is the simplest encryption algorithm. It adds a fixed value to the ASCII (unicode) value of each c
% Decrypting a text is simply shifting it back by the same amount, that is, it substracts the same value from the cha
% arguments: the first is the character vector to be encrypted, while the second is the shift amount. The function re
% needs to work with all the visible ASCII characters from space to ~. The ASCII codes of these are 32 through 12
% around. For example, if we shift ~ by 1, the result should be space. If we shift space by -1, the result should be ~
% starting on this assignment:
% double(' ')
% ans =
%  32
% double('~')
% ans =
%  126
% char([65 66 67])
% ans =
%  'ABC'
% ' ' : '~'
% ans =
%  ' !"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\]^_`abcdefghijklmnopqrst
% And here are a few example runs:
% caesar('ABCD',1)
% ans =
%  'BCDE'
% caesar('xyz ~',1)
% ans =
%  'yz{! '
% caesar('xyz ~',-1)
% ans =
%  'wxy~}'

%% program
function coded=caesar(str,n)
str=str-31;
for x=1:length(str)
    while abs(n)>95
        n=mod(n,95);
    end
    if str(x)+n > 95
        str(x)=mod((str(x)+n),95);
    elseif ((str(x)+n)>=1 && (str(x)+n)<=95)
        str(x)=str(x)+n;
    else
        str(x)=str(x)+n+95;
    end
end
coded=char(str+31);
end
%% coded    = caesar('ABCD',  1)
% decoded  = caesar(coded,  -3)
% wrap     = caesar('1234', 96)
% back     = caesar(wrap,  -96)
