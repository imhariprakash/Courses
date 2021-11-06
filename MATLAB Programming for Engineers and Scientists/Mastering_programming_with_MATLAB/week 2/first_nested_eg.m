function[s,t]=first_nested_example(x)
c=10;
sub(c,x);
s=inner(x);
    function out=inner(in)
        out=in*c;
    end
c=11;
sub(c,x);
t=inner(x);
end

function sub(c,x)
fprintf("Multiplying %d times %d gives %d.\n",c,x,c*x);
end