clc; clear;
n= randi([0 1],1,4); % Four input sequence
%NRZ unipolar pulse shaping
i=1;
t=0:0.01:length(n);
y=zeros(1,length(t));
for j=1:length(t)
    if t(j) <= i
        y(j) = n(i);
    else
        y(j)=n(i); i=i+1;
    end
end
subplot(3,1,1);plot(t,y,'k');title('Digital input sequence');xlabel('time--');ylabel('amplitude-');
%carrier
x=cos(2*pi*2*t);
%ASK modulation
ask = y.*x;
subplot(3,1,2);
plot(t,ask,'k') ;title('ASK signal');xlabel('time--->');ylabel('amplitude-> ');

%ASK demodulation
k=zeros(1,length(t));
for j=1:length(t)
    if x(j) == ask(j)
        k(j) = 1;
    else
        k(j) = 0;
    end
end
subplot(3,1,3);
plot(t,k,'k');title('Detected sequence');xlabel('time--');ylabel('amplitude-');

figure(2)

clc; clear;
n= randi([0 1],1,4); % Four input sequence
%Binary to polar conversion
nn=zeros(1,length(n));
for m=1:length(n)
    if n(m) == 0
        nn(m) = -1;
    else
        nn(m)=1;
    end
end
%NRZ pulse shaping
i=1;
t=0:0.01:length(n);
for j=1:length(t)
    if t(j) <= i
        y(j) = nn(i);
    else
        i=i+1; y(j)=nn(i);
    end
end
subplot(3,1,1);plot(t,y,'k');title('Digital input sequence');xlabel('time--');ylabel('amplitude-');
%carrier
x=cos(2*pi*2*t);
%BPSK modulation
bpsk = y.*x;
subplot(3,1,2);plot(t,bpsk,'k');title('BPSK signal');xlabel('time--');ylabel('amplitude-');
%BPSK demodulation
for j=1:length(t)
    if x(j) == bpsk(j)
        k(j) = 1;
    else
        k(j) = 0;
    end
end
subplot(3,1,3);plot(t,k,'k');title('Detected sequence');xlabel('time--');ylabel('amplitude-');


clc; clear;
figure(3);
n= randi([0 1],1,4); % Four input sequence
%NRZ unipolar pulse shaping
i=1;
t=0:0.01:length(n);
for j=1:length(t)
    if t(j) <= i
        y(j) = n(i);
    else
        y(j)=n(i); i=i+1;
    end
end
subplot(3,1,1);plot(t,y,'k');title('Digital input sequence');xlabel('time--');ylabel('amplitude-');
%carriers
f1=10; %carrier frequency 1
f2=5; %carrier frequency 2
y1=sin(2*pi*f1*t);
y2=sin(2*pi*f2*t);
%BFSK modulation
z=zeros(1,length(t));
for j=1:length(t)
    if y(j) == 1
        z(j) = y1(j);
    else
        z(j) = y2(j);
    end
end
subplot(3,1,2);plot(t,z,'k');title('BFSK signal');xlabel('time--');ylabel('amplitude-');
%BFSK demodulation
for j=1:length(t)
    if z(j) == y1(j)
        k(j) = 1;
    else
        k(j) = 0;
    end
end
subplot(3,1,3);plot(t,k,'k');title('Detected sequence');xlabel('time--');ylabel('amplitude-');



clc; clear;
% Input Generator Matrix
g=input('Enter The Generator Matrix: ');
disp ('G = ')
disp ('The Order of Linear block Code for given Generator Matrix is:')
[n,k] = size(transpose(g))
for i = 1:2^k
    for j = k:-1:1
        if rem(i-1,2^(-j+k+1))>=2^(-j+k)
            u(i,j)=1;
        else
            u(i,j)=0;
        end
    end
end
u
disp('The Possible Codewords are :');
c = rem(u*g,2)
disp('The Minimum Hamming Distance dmin for given Block Code is ')
d_min = min(sum((c(2:2^k,:))'))
% Code Word
r = input('Enter the Received Code Word:')
p = [g(:,n-k+2:n)];
h = [transpose(p),eye(n-k)];
disp('Parity matrix transpose is')
ht = transpose(h)
disp('Syndrome of a Given Codeword is :')
s = rem(r*ht,2)
for i = 1:1:size(ht)
    if(ht(i,1:3)==s)
        r(i) = 1-r(i);
        break;
    end
end
disp('The Error is in bit:')
i
disp('The Corrected Codeword is :')
r
