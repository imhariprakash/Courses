function out=reversal_assignment_sol(in)
if(length(in)<=1)
    out=in;
else
    out=[reversal_assignment_sol(in(2:end)) in(1)];
end