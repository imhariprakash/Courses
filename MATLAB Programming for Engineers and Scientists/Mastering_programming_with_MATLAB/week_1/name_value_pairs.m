% Name-Value Pairs
% 
% Name-value pairs are frequently used in programming. For our purposes here, a name-value pair consists of a n
% Write a function called name_value_pairs that has a variable number of input arguments representing name-va
% next is the value. This means that the function must be called with an even number of actual input arguments. T
% columns: the first column contains the names, while the second column contains the values. If the function is ca
% inputs or if a name is not of char type, the function returns an empty cell array. Here is an example run:
% >> db = name_value_pairs('name','John Smith','age',32,'children',{'Joe' 'Jill'})
% db =
%  3x2 cell array
%  {'name' } {'John Smith'}
%  {'age' } {[ 32]}
%  {'children'} {1x2 cell }

function out=name_value_pairs(varargin)
if nargin==0 || rem(nargin,2) ~=0
    out={};
else
    j=1;
    out=cell(nargin/2,2);
    for i=1:nargin/2
        if ~ischar(varargin{j})
            out={};
            break;
        else
            out(i,1)=varargin(j);
            out(i,2)=varargin(j+1); 
        end
        j=j+2;
    end
end
end

%% calling code
% db = name_value_pairs('name','John Smith','age',32)

%% slight alterations

% function out=name_value_pairs(varargin)
% out={};
% if nargin==0 || rem(nargin,2) ~=0  %no need to check for o input -> for loop 1:0 -> 0 so {} - initialized will be returned.
%     return;
% end
% % i=1,2,3,4,5; compare 1,3,5,7,9 -> 2*i -1 -> no need for j initialization and increment
% %out=cell(nargin/2,2);  initialization - reduces time for execution
% for i=1:nargin/2
%     if ~ischar(varargin{2*i-1})
%         out={} %-> if initialized must, else not necessary.
%         break;
%     else
%         out(i,1)=varargin(2*i-1);
%         out(i,2)=varargin(2*i); 
%     end
% end
% end
