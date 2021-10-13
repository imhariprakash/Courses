clc;close all;
a1=input("Enter passband ripple: " );
a2=input("Enter stopband ripple: ");
wp=input("Enter passband frequency: ");
ws=input("Enter stopband frequency: ");
fs=input("Enter sampling frequency: ");
w1=2*wp/fs;
w2=2*ws/fs;
[N,wn]= buttord(w1,w2,a1,a2);
[b,a]=butter(N,wn,'Low');
w=0:0.01:pi;
[H,omega]=freqz (b,q,w);
mag=20*log(abs(H));
subplot(4,1,1)
plot(omega/pi,mag)
xlabel('Normalized frequency');
ylabel('Magnitude');
title('Magnitude response');
ang=angle(H);
subplot(4,1,2)
plot(omega/pi,ang)
xlabel('Normalized frequency');
ylabel('angle');
title('phase response');


