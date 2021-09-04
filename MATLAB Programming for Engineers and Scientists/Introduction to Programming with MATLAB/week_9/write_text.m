function write_text(file_name)
file=fopen(file_name,'w+t');
if file<0
    fprintf("Error opening the file!");
    return;
end
mon=["Jan","Feb","March","April","May","June","July","Aug","Sep","Oct","Nov","Dec"];
line1="Climate Data for Nashville, TN";
line2="(Average highs (F), lows (F), and precip (in)";
line3="        High   Low Precip";
data=[46 28 3.98;51 31 3.70;61 39 4.88;70 47 3.94;78 57 5.08;85 65 4.09;89 69 3.78;88 68 3.27;82 61 3.58;71 49 2.87;59 40 4.45;49 31 4.53];
fprintf(file,"%s\n",line1);
fprintf(file,"%s\n\n",line2);
fprintf(file,"%s\n",line3);
for x=1:6
    fprintf(file,"%5s: ",mon(x));
    fprintf(file,"%5.2f,%5.2f,%5.2f\n",data(x,:));
end
fprintf(file,"\n%s\n",line3);
for x=7:12
    fprintf(file,"%5s: ",mon(x));
    fprintf(file,"%5.2f,%5.2f,%5.2f\n",data(x,:));
end
fclose(file);
end
%% write_text("write_text.txt");

