% Data entry
% In a voting center, the voters are required to give their names and ID numbers to the voting staff before going int
% incoming voters' information. The function should take an unspecified number of inputs, but the first input will be
% order of name, a string or char array, and ID, an integer or integer-valued double. If there is at least one ocurren
% required, return the original database. The function should return a struct array containing Name (a string) and ID
% >> database = voters([], 'Brandon', 12356)
% database =
%  struct with fields:
%  Name: "Brandon"
%  ID: 12356
% >> database = voters(database, "Mike", 9876, 'Akos', 112233)
% database =
%  1x3 struct array with fields:
%  Name
%  ID
% >> database(end)
% ans =
%  struct with fields:
%  Name: "Akos"
%  ID: 112233
% 
% However, if there is an illegal call, the database should not change:
% >> database
% database =
%  1x3 struct array with fields:
%  Name
%  ID
% >> database = voters(database, 'Student', 99999, "No ID")
% database =
%  1x3 struct array with fields:
%  Name
%  ID
%% code note:id must not be a float-must be integer double(whole)-integer.
% function database=voters(database,varargin)
% count=length(database);tmp=count; % if something illegal make the changes [] ->removed ->original returned.
% if rem(length(varargin),2)~=0  % pair - missing ->return the database;
%     return;
% end
% for i=1:length(varargin)/2
%     if (ischar(varargin{2*i-1})||isstring(varargin{2*i-1}))&&(isinteger(varargin{2*i})|| isa(varargin{2*i},'double'))&&(fix(varargin{2*i})==varargin{2*i}) 
%         count=count+1; %char/str-name and double-integer-not float->update in 
%         database(count).Name=string(varargin{2*i-1}); %update name
%         database(count).ID=double(varargin{2*i}); %update id
%     else
%         database(tmp+1:count)=[];  %illegal means remove the newly updated structs index from tmp+1 to end or count(incremented)
%         break;
%     end
% end
% end

%% calling code

% database = voters([], 'Adam', 11111)
% database = voters(database, 'Eve', 22222)
% database(1)
% database(2)
% database = voters([], 'Brandon', 12356)
% database = voters(database, "Mike", 9876, 'Akos', 112233)
% database(end)
% database
% database = voters(database, 'Student', 99999, "No ID")
% database = struct('Name',{"Kay","Teresa"},'ID',{12545,54354})
% database = voters(database, 'Justin', 1.352300e+01, 'Ariel', 3399)

%% method 2 - create a temporary array struct-any illegal names-return
%%original else return temp(updated one)

function database=voters(database,varargin)
count=length(database);tmp=database; % database is copied to a temporary one - success-update fail- return original
if rem(length(varargin),2)~=0  % pair - missing ->return the database;
    return;
end
for i=1:length(varargin)/2
    if (ischar(varargin{2*i-1})||isstring(varargin{2*i-1}))&&(isinteger(varargin{2*i})|| isa(varargin{2*i},'double'))&&(fix(varargin{2*i})==varargin{2*i}) 
        count=count+1; %char/str-name and double-integer-not float->update in 
        tmp(count).Name=string(varargin{2*i-1}); %update name in temp struct array
        tmp(count).ID=double(varargin{2*i}); %update id in temp struct array
    else
        return; % some illegal name return the original one(since not updated yet)
    end
end
database=tmp; %(no illegal names-function won't be returned -> so copy tmp to database -> updated one is the output)
end


