% can start from empty database - > empty database means [] -> empty list
% Can store names and Id s which are in char/str and double/int
% other formats won't be updated
% already existing name won't be updated
% message will be shown for other format and existing name
% reality all have unique id and names can be identical
% hence checking for id is recommended

function database=voters_mod(database,varargin)
count=length(database);
for i=1:length(varargin)/2
    if ~(isempty(database))&&~(sum(ismember([database.Name],varargin{2*i-1}))==0)
        fprintf("Name already there!\n");
    elseif (ischar(varargin{2*i-1})||isstring(varargin{2*i-1}))&&(isinteger(varargin{2*i}) || isa(varargin{2*i},'double'))
        count=count+1;
        database(count).Name=string(varargin{2*i-1});
        database(count).ID=double(varargin{2*i});
    else
        fprintf("%s with value %s is not updated due to error!\n",string(varargin{2*i-1}),string(varargin{2*i}));
    end
end
end
%output is at the end!

%% when database is not an empty list always a struct with field name(atleast)

% function database=voters_mod(database,varargin)
% count=length(database);
% for i=1:length(varargin)/2
%     if ~(isempty(database))&&~(sum(ismember([database.Name],varargin{2*i-1}))==0)
%         fprintf("%s with value %s is already there!\n",string(varargin{2*i-1}),string(varargin{2*i}));
%         continue;
%     elseif (ischar(varargin{2*i-1})||isstring(varargin{2*i-1}))&&(isinteger(varargin{2*i}) || isa(varargin{2*i},'double'))&&((sum(ismember([database.Name],varargin{2*i-1}))==0))
%         count=count+1;
%         database(count).Name=string(varargin{2*i-1});
%         database(count).ID=double(varargin{2*i});
%     else
%         fprintf("%s with value %s is not updated due to error!\n",string(varargin{2*i-1}),string(varargin{2*i}));
%     end
% end
% end


%% when no name checking - already there or not is not required
% 
% function database=voters_mod(database,varargin)
% count=length(database);
% for i=1:length(varargin)/2
%     if (ischar(varargin{2*i-1})||isstring(varargin{2*i-1}))&&(isinteger(varargin{2*i}) || isa(varargin{2*i},'double'))
%         count=count+1;
%         database(count).Name=string(varargin{2*i-1});
%         database(count).ID=double(varargin{2*i});
%     else
%         fprintf("%s with value %s is not updated due to error!\n",string(varargin{2*i-1}),string(varargin{2*i}));
%     end
% end
% end
% 

%% output

% database = voters_mod([], 'Adam', 11111,'hari',123,'gopal',121,'free',678)
% 
% database = 
% 
%   1×4 struct array with fields:
% 
%     Name
%     ID
% 
% database = voters_mod(database, 'Adam', 11111,'hari',123,'gopal',121,'free',678);
% Name already there!
% Name already there!
% Name already there!
% Name already there!

