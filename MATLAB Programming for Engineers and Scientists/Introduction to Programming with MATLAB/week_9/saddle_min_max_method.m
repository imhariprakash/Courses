%% this method uses min max for finding the minimum of the column and maximum of the row then compare with that element instead of doing this using
% for loops

function indices=saddle(M)
[row col]=size(M);
a=1;indices=[];
for x=1:row
    for y=1:col
        ma=max(M(x,:));
        mi=min(M(:,y));
        if (M(x,y)>=ma)&&(M(x,y)<=mi)
            indices(a,1)=x;
            indices(a,2)=y;
            a=a+1;
        end
    end
end 
end
% %%  create an interesting surface
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
