function mod_sierpinski(depth)
if (depth<0 || fix(depth)~=depth || ~isscalar(depth))
    error("depth must be a non negative scalar integer value!");
    return;
end
s=1;c=[0;0];
axis([c(1)-[s,-s]/2,c(2)-[s,-s]/2],'equal');
pts=sier(s,c,depth,[]);
%plot(pts(1,:),pts(2,:));
end

function pts=sier(s,c,depth,pts)
if depth==0
    pts=[pts,c+[[s,0,-s,s,nan]/2;[-s,s,-s,-s,nan]*sqrt(3)/4]];
else
    s=s/2;h=s*(sqrt(3)/2);
    pts=sier(s,c+[s;-h]/2,depth-1,pts);
    pts=sier(s,c+[-s;-h]/2,depth-1,pts);
    pts=sier(s,c+[0;h]/2,depth-1,pts);
end
end

