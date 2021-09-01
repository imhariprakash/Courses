% Sparse Matrix
% 
% A sparse matrix is a large matrix with almost all elements of the same value (typically zero). The normal represe
% information can be captured with much less. A possible way to represent a sparse matrix is with a cell vector wh
% sparse matrix. The second element is a scalar specifying the default value of the sparse matrix. Each successive
% element of the sparse matrix that has a value other than the default. The three elements are the row index, the c
% sparse2matrix that takes a single input of a cell vector as defined above and returns the output argument called
% run:
% cellvec = {[2 3], 0, [1 2 3], [2 2 -3]};
% matrix = sparse2matrix(cellvec)
% matrix =
%  0 3 0
%  0 -3 0

%% my code
function matrix=sparse2matrix(v)
row=v{1,1}(1,1);
col=v{1,1}(1,2);
def=v{1,2};
matrix=def * ones(row,col);
for x=3:length(v)
    r=v{1,x}(1,1);
    c=v{1,x}(1,2);
    matrix(r,c)=v{1,x}(1,3);
end
end
%% solution code
function M = sparse2matrix(cellvec)
    sz = cellvec{1};
    val = cellvec{2};
    M = val*ones(sz);
    for i = 3:length(cellvec)
        el = cellvec{i};
        M(el(1), el(2)) = el(3);
    end
end
%% my code efficient
function matrix=sparse2matrix(v)
b=v{1};
def=v{2};
matrix=def * ones(b);
for x=3:length(v)
    r=v{x};
    matrix(r(1),r(2))=r(3);
end
end
