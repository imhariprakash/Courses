function varargout=inf_out(v)
if nargout>nargin
    error("Input arguments are not enough!");
end
for i=1:length(v)
    varargout{i}=v(i);
end