% DPSK #
clc;clear;
rng default
figure;
M =4; % Alphabet size
dataIn = randi([0 M-1],300,1); % Random message
txSig = dpskmod(dataIn,M,pi/4); % Modulate
plot(txSig);
title('DPSK SIGNAL');


% QPSK %
clc;
clear;
figure;
%GENERATE QUADRATURE CARRIER SIGNAL
Tb=1;t=0:(Tb/100):Tb;fc=1;
c1=sqrt(2/Tb)*cos(2*pi*fc*t);
c2=sqrt(2/Tb)*sin(2*pi*fc*t);
%generate message signal
N=8;m=rand(1,N);
t1=0;t2=Tb;
for i=1:2:(N-1)
    t=[t1:(Tb/100):t2];
    if m(i)>0.5
        m(i)=1;
        m_s=ones(1,length(t));
    else
        m(i)=0;
        m_s=-1*ones(1,length(t));
    end
    %odd bits modulated signal
    odd_sig(i,:)=c1.*m_s;
    if m(i+1)>0.5
        m(i+1)=1;
        m_s=ones(1,length(t));
    else
        m(i+1)=0;
        m_s=-1*ones(1,length(t));
    end
    %even bits modulated signal
    even_sig(i,:)=c2.*m_s;
    %qpsk signal
    qpsk=odd_sig+even_sig;
    %Plot the QPSK modulated signal
    subplot(3,2,4);plot(t,qpsk(i,:));
    title('QPSK signal');xlabel('t---->');
    ylabel('s(t)');grid on; hold on;
    t1=t1+(Tb+.01); t2=t2+(Tb+.01);
end
hold off
%Plot the binary data bits and carrier signal
subplot(3,2,1);stem(m);
title('binary data bits');xlabel('n---->');ylabel('b(n)');grid on;
subplot(3,2,2);plot(t,c1);
title('carrier signal-1');xlabel('t---->');ylabel('c1(t)');grid on;
subplot(3,2,3);plot(t,c2);
title('carrier signal-2');xlabel('t---->');ylabel('c2(t)');grid on;


%>>>>>>>>>>>>>>>>>> Matlab code for M ary-QAM modulation >>>>>>>>>>>>>>>>>%
clc;clear;
M=4;
figure(3);
%M=input(' enter the value of M array for QAM modulation : ');
fprintf('\n\n\n');
%XXXXXXXXXXXXXXXXXXXXXXXXXXX input checking loop
Ld=log2(M);
ds=ceil(Ld);
dif=ds-Ld;
if(dif~=0)
 error('the value of M is only acceptable if log2(M)is an integer');
end
%XXXXXXXXXX binary Information Generation
nbit=16; %number of information bits
msg=round(rand(nbit,1)); % information generation as binary form
disp(' binary information at transmitter ');
disp(msg);
fprintf('\n\n');
%XX representation of transmitting binary information as digital signal XXX
x=msg;
bp=.000001; % bit period
bit=[];
for n=1:1:length(x)
 if x(n)==1
    se=ones(1,100);
 else x(n)==0;
    se=zeros(1,100);
 end
 bit=[bit se];
end
t1=bp/100:bp/100:100*length(x)*(bp/100);
subplot(3,1,1);
plot(t1,bit,'lineWidth',2.5);grid on;
axis([ 0 bp*length(x) -.5 1.5]);
ylabel('amplitude(volt)');
xlabel(' time(sec)');
title('transmitting information as digital signal');
% binary information convert into symbolic form for M-array QAM modulation
M=M; % order of QAM modulation
msg_reshape=reshape(msg,log2(M),nbit/log2(M))';
disp(' information are reshaped for convert symbolic form');
disp(msg_reshape);
fprintf('\n\n');
size(msg_reshape);
for(j=1:1:nbit/log2(M))
 for(i=1:1:log2(M))
      a(j,i)=num2str(msg_reshape(j,i));
 end
end
as=bin2dec(a);
ass=as';
figure(3);
subplot(3,1,2);
stem(ass,'Linewidth',2.0);
title('serial symbol for M-array QAM modulation at transmitter');
xlabel('n(discrete time)');
ylabel(' magnitude');
disp('symbolic form information for M-array QAM ');
disp(ass);
fprintf('\n\n');
%XXXXXXXXXXXXXX Mapping for M-array QAM modulation
M=M; %order of QAM modulation
x1=[0:M-1];
p=qammod(ass,M) %constellation design for M-array QAM according to symbol
sym=0:1:M-1; % considerable symbol of M-array QAM, just for scatterplot
pp=qammod(sym,M); %constellation diagram for M-array QAM
scatterplot(pp),grid on;
title('constellation diagram for M-array QAM');
%XXXXXXXXXXXXXXXXXXXXXX M-array QAM modulation
RR=real(p)
II=imag(p)
sp=bp*2; %symbol period for M-array QAM
sr=1/sp; % symbol rate
f=sr*2;
t=sp/100:sp/100:sp;
ss=length(t);
m=[];
for(k=1:1:length(RR))
 yr=RR(k)*cos(2*pi*f*t); % inphase or real component
 yim=II(k)*sin(2*pi*f*t); % Quadrature or imaginary component
 y=yr+yim;
 m=[m y];
end
tt=sp/100:sp/100:sp*length(RR);
figure(3);
subplot(3,1,3);
plot(tt,m);
title('waveform for M-array QAM modulation according to symbolic information');
xlabel('time(sec)');
ylabel('amplitude(volt)');

%}