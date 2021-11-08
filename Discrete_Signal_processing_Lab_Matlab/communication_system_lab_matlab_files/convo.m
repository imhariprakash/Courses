clear;clc;
%(2,1,2)Convolutionalencoder
m=[1 0 1 1];%Messagesequence
p=2; %Numberofflipflops
z=zeros(1,p);
mm=horzcat(m,z);%Additionalzerosaddedwithmessagesequen
d1=zeros(1,length(mm));d2=zeros(1,length(mm));%tInitialcontentsoftheflipflops
x=[];%Flipflopstates
c=[];%Codevector
for i=1:1:length(mm)
    d1(i+1)=mm(i);
    d2(i+1)=d1(i);
x=[x;d1(i) d2(i)];%Statesoftheshiftregister
u(i)=xor(x(i,1),x(i,2));
c1(i)=xor(u(i),mm(i));%Firstoutputbit
c2(i)=xor(mm(i),x(i,2));%Secondoutputbit
c=[c c1(i) c2(i)];
end
disp('States of the shift register:')
x
disp('Code vector')
c