%% 1.Unit Impulse function
i=1;
for n=-10:10
    if n~=0
        x(i)=0;
        i=i+1;
    else
        x(i)=1;
        i=i+1;
    end
end
n=-10:10;
subplot(2,4,1);
stem(n,x,'b')

ylabel('amplitude');
xlabel('time period');
title('Unit impulse');
%% 2.Unit Step function
n=0:10;
x=ones(1,11);
stem(n,x,'b');
subplot(2,4,2);
stem(n,x,'b');
ylabel('amplitude');
xlabel('sequence');
title('unit step');
%% 3.Unit Ramp function
n=0:20;
x=n;
%plot(n,x)
stem(n,x,'g');
subplot(2,4,3);
ylabel('amplitude');
xlabel('sequence');
title('unit ramp');
%% 4.exponential waveform
t=0:0.01:1;
a=2;
b=a*exp(2*pi*2*t);
subplot(2,4,4);
stem(t,b);
title ('exponential wave'); 
ylabel('amplitude');
xlabel('time period');
%% 5.sine wave
t=0:0.01:1;
a=2;
b=a*sin(2*pi*2*t);
subplot(2,4,5);
stem(t,b);
xlabel('time');
ylabel('Amplitude');
title ('sinewave');
%% 6.cosine wave
t=0:0.01:1;
a=2;
b=a*cos(2*pi*2*t);
subplot(2,4,6);
stem(t,b);
xlabel('time');
ylabel('Amplitude');
title ('Cos wave');
%% 7.Square wave
t=0:0.01:1;
a=2;
b=a*square(2*pi*2*t);
subplot(2,4,7);
stem(t,b);
xlabel('time');
ylabel('Amplitude');
title ('square wave');
%% 8.Sawtooth
t=0:0.01:0.5;
a=2;
b=a*sawtooth(2*pi*2*t);
subplot(2,4,8);
stem(t,b);
xlabel('time');
ylabel('Amplitude');
title ('sawtooth wave'); 









