function indices=saddle(M)
[row,col]=size(M);
a=1;indices=[];
for x=1:row
    for y=1:col
        r=0;c=0;
        for s=1:col
            if M(x,y)>=M(x,s)
                r=r+1; % saddle point => r=col,c=row - my method is not so efficient
            end
        end
        for t=1:row
            if M(x,y)<=M(t,y)
                c=c+1;
            end
        end
        if (r==col)&&(c==row)
            indices(a,1)=x;
            indices(a,2)=y;
            a=a+1;
        end
    end
end 
end
% 
% %% % create an interesting surface
% [X,Y] = meshgrid(-15:0.5:10,-10:0.5:10);
% Z = (X.^2-Y.^2)';
% % find saddle points
% indices = saddle(Z)
% % plot surface
% surf(Z);
% hold on
% % mark saddle points with red dots in the same figure
% for ii = 1:size(indices,1)
%     h = scatter3(indices(ii,2),indices(ii,1),Z(indices(ii,1),indices(ii,2)),'red','filled');
%     h.SizeData = 120;
% end
% % adjust viewpoint
% view(-115,14);
% hold off
