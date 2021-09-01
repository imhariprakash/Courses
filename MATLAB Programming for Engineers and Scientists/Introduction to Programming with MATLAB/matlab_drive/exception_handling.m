function [table summa]=multable(n,m)

%multable - multiplication table
%T = multable(n) returns an n by n matrix
%having the multiplication table for the interger
%1 through n
%multable(n,m) returns n by m matrix
%Both inputs must be positive integers
%[T SM]=multable(n m) returns the matrix having
%multiplication table in T and sum of its elements
%in SM.

if nargin<1
    error('Enter atleast one argument.')
end
if n<1 || ~isscalar(n) || n ~=fix(n)
    error('n must be a scalar and positive interger')
end
if nargin<2
    m=n;
elseif m<1 || ~isscalar(m) || m ~=fix(m)
    error('m must be a scalar and positive interger')
end
table=(1:n)' * (1:m);
if nargout==2
    summa=sum(table(:));
end
end