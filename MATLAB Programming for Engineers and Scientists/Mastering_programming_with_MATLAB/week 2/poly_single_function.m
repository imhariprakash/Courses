%polynomial with only one function but two inputs are must

function polynomial = poly_fun(p,x)
 polynomial=sum(p.*(x.^(0:length(p)-1)));
end

%% run code

pf=@poly_fun
pf(ones(1,10),2)
pf(1:5,1)