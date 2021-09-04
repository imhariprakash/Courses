% we are only focusing on matrices-rows and columns - don't care of 1 st
% value of dat file - since its always gonna be the value 2.

function data=read_binaryfile(data_type,file)
file=fopen(file,'r');
if file<0
    error("File can't be opened");
end
z=4;
dat=(fread(file,inf,data_type))';
data=zeros(dat(1,2),dat(1,3));
for x=1:dat(1,3)
    for y=1:dat(1,2)
        data(y,x)=dat(1,(z));
        z=z+1;
    end
end
fclose(file);
end
%% for efficiency we can use reshape function
% n=dat(1,1);
% take dim=fread(dat,n,'double');
% data=reshape(dat,dim);

% z=[1 2 3 4 5 6 7 8];
% reshape(z,[2,4])
% ans =
%      1     3     5     7
%      2     4     6     8

%don't need to be a matrix - any dimension - since using the reshape function
