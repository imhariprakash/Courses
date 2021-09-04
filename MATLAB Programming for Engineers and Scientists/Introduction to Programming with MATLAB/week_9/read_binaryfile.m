function data=read_binaryfile(data_type,file)
file=fopen(file,'r');
if file<0
    error("File can't be opened");
end
data=fread(file,inf,data_type);
fclose(file);
end