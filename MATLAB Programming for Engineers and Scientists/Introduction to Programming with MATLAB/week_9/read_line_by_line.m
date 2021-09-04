function read_line_by_line(file)
file=fopen(file,'rt');
line=fgets(file);
fprintf("\n");
while ischar(line)
    fprintf("%s",line)
    line=fgets(file);
end
fprintf("\n");
end