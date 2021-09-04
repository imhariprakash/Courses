function indices=saddle(M)
indices=[];
mi=(M<=(min(M,[],1)));
ma=(M>=(max(M,[],2)));
mat=mi & ma;
[row col]=find(mat);
if ~isempty([row col])
    indices=[row col];
    if isrow([row col])
        indices=[row' col'];
end
end