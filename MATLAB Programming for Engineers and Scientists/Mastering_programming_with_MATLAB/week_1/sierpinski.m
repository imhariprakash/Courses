function sierpinski(depth)
c=[0;0];s=1;
clf;
axis([c(1)-s/2,c(1)+s/2,c(2)-s/2,c(2)+s/2],'equal');
hold on % for gap and flow
title(sprintf('Sierpinski Triangle with depth = %d.',depth));
sier(s,c,depth);
hold off
end

function sier(s,c,depth)
if depth==0
    plot(c(1)+[s,0,-s,s]/2,c(2)+[-s,s,-s,-s]*sqrt(3)/4);
    %height of equilateral triangle=sqrt(3)/2 => (sqrt(3)/2)*1/2=sqrt(3)/4
else
    s=s/2;
    h=(s)*(sqrt(3)/2);
    sier(s,c-[s;h]/2,depth-1);
    sier(s,c+[s;-h]/2,depth-1);
    sier(s,c+[0;h]/2,depth-1);
end
end