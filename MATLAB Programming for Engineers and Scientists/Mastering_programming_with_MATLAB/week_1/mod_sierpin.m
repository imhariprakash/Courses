function sierpin_attempt2(depth)
s=1;c=[0;0];clf
axis([c(1)-s/2,c(1)+s/2,c(2)-s/2,c(2)+s/2],'equal');
hold on
%plot(c(1)+[s,0,-s,s]/2,c(2)+[-s,s,-s,-s]*(sqrt(3)/4),'r--');
pts=sier(s,c,depth,[]);
plot(pts(1,:),pts(2,:));
hold off
end

function pts=sier(s,c,depth,pts)
if depth==0
    %pause(3/5)
    pts=[pts,c+[[s 0 -s s nan]/2;[-s s -s -s nan]*(sqrt(3)/4)]];
else
    s=s/2;h=s*(sqrt(3)/2);
    pts=sier(s,c+[s;-h]/2,depth-1,pts);
    pts=sier(s,c+[-s;-h]/2,depth-1,pts);
    pts=sier(s,c+[0;h]/2,depth-1,pts);
end
end