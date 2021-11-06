% Autograder
% learningtool.mathworks.com/launch
% Here is you chance to write an autograder! Specifically, write a function called grader that tests two functions 
% (one is supposed to be the student's solution and the other the reference solution provided by the instructor) by
% calling them repeatedly with various input arguments and comparing the results. For simplicity, we assume that both
% functions take exactly one input argument. The inputs to the grader function are two function handles followed by a 
% variable number of additional input arguments. The function must call the two functions with each of the supplied
% input agruments one by one. If the results match for all test cases, that is, for each input argument, the grader
% function returns logical true. Otherwise, it returns false. Note that in order to ensure that the comparison works 
% for arrays and not just scalars, you should use the isequal function as opposed to the == operator. Here are a few
% sample runs using built-in functions:
% 
% >> grader(@sin,@max,0)
% 
% ans =
% 
% logical
% 
% 1
% 
% >> grader(@sin,@max,0,1)
% 
% ans =
% 
% logical
% 
% 0
% 
% >> grader(@cos,@cos,-pi,0,pi,[0:0.1:1])
% 
% ans =
% 
% logical
% 
% 1
%% code

function ans=grader(fun1,fun2,varargin)
ans=false;
a=fun1([varargin{:}]);
b=fun2([varargin{:}]);
if sum(a==b)==length(a)
    ans=true;
end
end

%% run code

grader(@sin,@max,0)
grader(@sin,@max,0,1)
grader(@cos,@cos,0,1,[-pi,0,pi])
