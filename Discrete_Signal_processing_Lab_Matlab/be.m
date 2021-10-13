clear;clc;
 a1=input("Enter the passband ripple: ");
a2=input("Enter the stopband ripple: ");
 wp=input("Enter the passband frequency: ");
 ws=input("Enter the stopband frequency: ");

fs=input("Enter sampling frequency");    
w1=2*wp/fs;    
w2=2*ws/fs;
[N,wn]=buttord(w1,w2,a1,a2);  
[b,a]=butter(N,wn,'low');
w=0:0.01:pi;
[H,omega]=freqz(b,a,w);
mag=20*log(abs(H));
figure(1)
subplot(4,1,1);
plot(omega/pi,mag);
xlabel("Normalized frequency");
ylabel("Magnitude");
title("Magnitude plot");
ang=angle(H);
subplot(4,1,2);
plot(omega/pi,ang);
xlabel("Normalized frequency");
ylabel("Phase");
title("Phase response");
clc;

