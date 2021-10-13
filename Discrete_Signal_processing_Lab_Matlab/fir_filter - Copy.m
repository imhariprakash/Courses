%% Low pass
clear;clc
N=input("Enter the length of the filter: ");
wn=input("Enter the Normalized cutoff frequency: ");
fprintf("1. Rectangular 2. Hamming \n");
y=input("Enter the type of window: ");
w1=input("Enter the start Normalized cutoff frequency: ");
w2=input("Enter the stop Normalized cutoff frequency: ");
if(y==1)
    y=rectwin(N+1);
else
    y=hamming(N+1);
end
b1=fir1(N,wn,'low',y);
[H1,omega1]=freqz(b1);
mag1=20*log(abs(H1));
figure(1);subplot(2,1,1);
plot(omega1/pi,mag1);
xlabel("Low pass - Normalized frquency");
ylabel("Magnitude");
title("Magnitude Response");
ang1=angle(H1);
subplot(2,1,2);
plot(omega1/pi,ang1);
xlabel("Normalized frquency");
ylabel("Phase");
title("Phase Response");
%% High pass
b2=fir1(N,wn,'high',y);
[H2,omega2]=freqz(b2);
mag2=20*log(abs(H2));
figure(2);subplot(2,1,1);
plot(omega2/pi,mag2);
xlabel("High pass - Normalized frquency");
ylabel("Magnitude");
title("Magnitude Response");
ang2=angle(H2);
subplot(2,1,2);
plot(omega2/pi,ang2);
xlabel("Normalized frquency");
ylabel("Phase");
title("Phase Response");

%% band pass
wn=[w1,w2];
b3=fir1(N,wn,'band',y);
[H3,omega3]=freqz(b3);
mag3=20*log(abs(H3));
figure(3);subplot(2,1,1);
plot(omega3/pi,mag3);
xlabel("Band pass - Normalized frquency");
ylabel("Magnitude");
title("Magnitude Response");
ang3=angle(H3);
subplot(2,1,2);
plot(omega3/pi,ang3);
xlabel("Normalized frquency");
ylabel("Phase");
title("Phase Response");

%% stop band
b4=fir1(N,wn,'stop',y);
[H4,omega4]=freqz(b4);
mag4=20*log(abs(H4));
figure(4);subplot(2,1,1);
plot(omega4/pi,mag4);
xlabel("Stop band - Normalized frquency");
ylabel("Magnitude");
title("Magnitude Response");
ang4=angle(H4);
subplot(2,1,2);
plot(omega4/pi,ang4);
xlabel("Normalized frquency");
ylabel("Phase");
title("Phase Response");
clc;clear;