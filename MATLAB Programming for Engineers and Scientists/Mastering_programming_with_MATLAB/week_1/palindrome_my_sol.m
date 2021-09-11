% the course grader checks for recursion- i used recursion in sub functions in
% place of using in main function but graded rejected that.
% The problem with using recursion in main function is only able to
% reverse need to check and return logical values. any thing in main
% function will be executed in each and every call. So instead of returning 
% list it returned logical values-next calls get corrupted.
% end

%can try nargout but the same problem-grader as well as my prog both needs
% a single argument return value

% function p=palindrome(w)
% if length(w)==1
%     m=w(1);
% else
%     m=[palindrome(w(2:end)),w(1)];
% end 
% p=match(w,m);
% end
% 
% function p=match(w,m)
% p=false;
% a=length(w);
% b=sum(w==m);
% if b==a
%     p=true;
% end
% end

% Error using horzcat
% The following error occurred converting from logical to char:
% Conversion to char from logical is not possible.
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];
% 
% Error in palindrome (line 5)
%     m=[palindrome(w(2:end)),w(1)];

%% Recursive case in sub function palindrome- my try

function p=palindrome(str)
p=false;
rts=reverse(str);
a=sum(rts==str);
if a==length(str)
    p=true;
end
end

function w=reverse(v)
if length(v)==1
    w=v(1);
else
    w=[reverse(v(2:end)),v(1)];
end
end

%% Other way for grader's satisfaction
% efficient too - no need for reversing-reassignment-just compare
% and reject at any stage if not satisfied

function p=palindrome(str)
if length(str)<=1
    p=true; %no need for return since if else statement
else
    p=(str(1)==str(end) && palindrome(str(2:end-1)));
end
end