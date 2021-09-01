function cal=my_cal(mont,yeaar)
dat=datetime(yeaar,mont,1);
dat.Format='MMMM yyyy';
cal_num=string(calendar(dat));
cal=strings(11,1);
title=string(dat);
left_space=blanks(floor(((28-length(char(title)))/2)));
right_space=blanks(ceil(((28-length(char(title)))/2)));
cal([1 3 11])="----------------------------";
cal(4)=" Su  Mo  Tu  We  Th  Fr  Sa ";
cal(2)=sprintf("%s",left_space,title,right_space);
for x=1:6
    temp=sprintf("%3s ",cal_num(x,:));
    cal(x+4)=strrep(temp," 0","  ");
end
end
