function inv_tree_pat(n)
for x=1:n
    for y=0:x-1
        fprintf(' ');
    end
    for z=n:-1:x
        fprintf('*');
    end
    fprintf('\n');
end
end