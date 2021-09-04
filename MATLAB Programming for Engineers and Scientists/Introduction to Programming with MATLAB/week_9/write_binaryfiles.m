function write_binaryfile(data,file)
file=fopen(file,"w+");
if file<0
    error("File can't be opened");
    return; % no need for a return statement- error will take care of that
end
fwrite(file,data,'double');
fclose(file);
end

