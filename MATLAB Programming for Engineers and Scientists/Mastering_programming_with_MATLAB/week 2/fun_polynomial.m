% Fun with Polynomials
% 
% Remember the example from the video that showed how to return a function handle to a nested function that co
% function fh = get_polynomial_handle(p)
%  function polynomial = poly(x)
%  polynomial = 0;
%  for ii = 1:length(p)
%  polynomial = polynomial + p(ii) .* x.^(ii-1);
%  end
%  end 
%  fh = @poly;
% end
% It takes a vector of coefficients p, defines a function that returns the value of the polynomial given the scalar inpu
% >> p = get_polynomial_handle(1:5)
% p =
%  function_handle with value:
%  @get_polynomial_handle/poly
% >> p(1)
% ans =
%  15
% Your task is simple: modify the code above so that it does not use any loops.

%% polynomial without loop

function pf = poly_fun(p)
 function polynomial = poly(x)
 polynomial=sum(p.*(x.^(0:length(p)-1)));
 end 
 pf = @poly;
end

%% run code

pf = poly_fun(1:5);
pf(1)
pf = poly_fun(ones(1,10));
pf(2)