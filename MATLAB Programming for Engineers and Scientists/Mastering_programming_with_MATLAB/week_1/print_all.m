function print_all(varargin)
for i=1:nargin
    fprintf("Input no %d: %d\n",i,varargin{i});
end
end