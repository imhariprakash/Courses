% writes size as well as length of the size array in the dat file

function write_binaryfile(data,file)
file=fopen(file,"w+");
if file<0
    error("File can't be opened");
    return; % no need for a return statement- error will take care of that
end
dim=size(data);
fwrite(file,length(dim),'double');
fwrite(file,dim,'double');
fwrite(file,data,'double');
fclose(file);
end