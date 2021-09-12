function out=print_all2(format,varargin)
out='';  %initializing the output.
argindex=1;  %for counting the no of input arguments req in format
skip=false;  % when ever you see % there is a req of skip(next loop)
for i=1:length(format)
    if skip
        skip=false;
    else
        if format(i)~='%'
            out(end+1)=format(i);
        else
            if i+1 > length(format)
                break
            end
            if format(i+1)=='%'
                out(end+1)='%';
            else
                if argindex>=nargin
                    error("Not enough input arguments!");
                end
                out=[out,num2str(varargin{argindex},format(i:i+1))];
                argindex=argindex+1;
            end
            skip=true;
        end
    end
end

%% try 2

% function out=print_all1(format,varargin)
% out='';
% argindex=1;
% skip=false;
% for i=1:length(format)
%     if skip
%         skip=false;
%     else
%         if format(i)~='%'
%             out(end+1)=format(i);
%         else
%             if i+1 > length(format)
%                 break
%             end
%             if format(i+1)=='%'
%                 out(end+1)='%';
%             else
%                 if argindex>=nargin
%                     error("Not enough input arguments!");
%                 else
%                     out=[out,num2str(varargin{argindex})];
%                     argindex=argindex+1;
%                 end
%             end
%         end
%     end
% end