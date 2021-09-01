function coder=caesar(v,n)
coder=v-31+n
coder=char(mod(coder,95)+31);
end