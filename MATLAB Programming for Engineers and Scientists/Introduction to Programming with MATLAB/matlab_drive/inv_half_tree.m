function inv_half_tree(n)
for x=1:n
    for y=n:-1:x
        fprintf('*');
    end
    fprintf('\n');
end