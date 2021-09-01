function caesarr=circshif(v,n)
v1=' ':'~';
[~,v]=ismember(v,v1)
v1=circshift(v1,-n)
caesarr=v1(v);
end