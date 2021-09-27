%%unit step
% when n is negative y is zero else one
n=input("Enter the interval: ");
n=-n:n;
y=zeros(length(n));
a=1;
for i=n
    if i<0
        y(a)=0;
    else
        y(a)=1;
    end
    a=a+1;
end
subplot(4,2,1);
stem(n,y);
title("Unit step");
xlabel("Time");
ylabel("Amplitude")

%% unit ramp
% when n is negative y is zero else y is n
n=input("Enter the interval: ");
n=-n:n;
a=1;
y=zeros(length(n));
for i=n
    if i<0
        y(a)=0;
    else
        y(a)=i;
    end
    a=a+1;
end
subplot(4,2,2);
stem(n,y);
title("Unit ramp");
xlabel("Time");
ylabel("Amplitude")

%% Unit impulse
% y=1 only when n=0
n=input("Enter the interval: ");
n=-n:n;
y=zeros(length(n));
a=1;
for i=n
    if i==0
        y(a)=1;
    end
    a=a+1;
end
subplot(4,2,3);
stem(n,y);
title("Unit impulse");
xlabel("Time");
ylabel("Amplitude")

%% exponential 

f=input("Enter the frequency: "); %have freq as 100 - perfect
a=1; %unit amplitude
fs=5000;
ts=(1/fs);
ts = ts*(0:100);
y=a*exp(2*pi*f*ts);
subplot(4,2,4);
stem(y);
title("Unit exponential wave");
xlabel("Time");
ylabel("Amplitude")

%% sine wave
% make sample at a frequency of fs
f=input("Enter the frequency: "); %have freq as 50 - perfect
a=1; %unit amplitude
fs=5000;
ts=(1/fs);
ts = ts*(0:100);
y=a*sin(2*pi*f*ts);
subplot(4,2,5);
stem(y)
title("Sine wave");
xlabel("Time");
ylabel("Amplitude")

%% cosine wave

f=input("Enter the frequency: "); %have freq as 50 - perfect
a=1; %unit amplitude
fs=5000;
ts=(1/fs);
ts = ts*(0:100);
y=a*cos(2*pi*f*ts);
subplot(4,2,6);
stem(y);
title("Cosine wave");
xlabel("Time");
ylabel("Amplitude")

%% random function

a=1; %unit amplitude
fs=5000;
ts=(1/fs);
ts = ts*(0:30);
y=randi(10,1,length(ts));
subplot(4,2,[7,8]);
stem(y);
title("Random wave");
xlabel("Time");
ylabel("Amplitude")