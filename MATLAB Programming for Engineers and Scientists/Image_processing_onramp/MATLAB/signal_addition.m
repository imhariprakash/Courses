x1=[1 2 3];n1=0:2;   % first sequence and its index
x2=[1 0 3];n2=-1:1;  % second sequence and its index
n=min(min(n1),min(n2)):max(max(n1),max(n2));
y1 = zeros(1,length(n)); y2 = y1;
y1(((n>=min(n1))&(n<=max(n1))==1))=x1;
y2(((n>=min(n2))&(n<=max(n2))==1))=x2;
y=y1+y2;

n=-5:5;
x=zeros(n)

