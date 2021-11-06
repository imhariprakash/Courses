%low pass

clear;clc;
% a1=input("Enter the passband ripple: ");
% a2=input("Enter the stopband ripple: ");
% wp=input("Enter the passband frequency: ");
% ws=input("Enter the stopband frequency: ");
a1=3;a2=15;wp=1000;ws=2000;
fs=2*(wp+ws);   % the value of fs muist be greater then only the w1,w2 is normalized bw 0 and 1
w1=2*wp/fs;     %w1,w2 must be between 0 and 1 for buttord function
w2=2*ws/fs;
[N,wn]=buttord(w1,w2,a1,a2);  
[b,a]=butter(N,wn,'low');
w=0:0.01:pi;
[H,omega]=freqz(b,a,w);
mag=20*log(abs(H));
figure(1)
subplot(2,1,1);
plot(omega/pi,mag);
xlabel("Normalized frequency");
ylabel("Magnitude");
title("Magnitude plot");
ang=angle(H);
subplot(2,1,2);
plot(omega/pi,ang);
xlabel("Normalized frequency");
ylabel("Phase");
title("Phase response");
clc;

%% high pass

clear;clc;
% a1=input("Enter the passband ripple: ");
% a2=input("Enter the stopband ripple: ");
% wp=input("Enter the passband frequency: ");
% ws=input("Enter the stopband frequency: ");
a1=3;a2=15;wp=1000;ws=500;
fs=2*(wp+ws);   % the value of fs muist be greater then only the w1,w2 is normalized bw 0 and 1
w1=2*wp/fs;     %w1,w2 must be between 0 and 1 for buttord function
w2=2*ws/fs;
[N,wn]=buttord(w1,w2,a1,a2); 
figure(2)
[b,a]=butter(N,wn,'high');
w=0:0.01:pi;
[H,omega]=freqz(b,a,w);
mag=20*log(abs(H));
subplot(2,1,1);
plot(omega/pi,mag);
xlabel("Normalized frequency");
ylabel("Magnitude");
title("Magnitude plot");
ang=angle(H);
subplot(2,1,2);
plot(omega/pi,ang);
xlabel("Normalized frequency");
ylabel("Phase");
title("Phase response");
clc;

%% pass band

clear;clc;
% a1=input("Enter the passband ripple: ");
% a2=input("Enter the stopband ripple: ");
% wp=input("Enter the passband frequency: ");
% ws=input("Enter the stopband frequency: ");
a1=1;a2=10;wp=1000;ws=5000;
fs=2*(wp+ws);   % the value of fs muist be greater then only the w1,w2 is normalized bw 0 and 1
w1=2*wp/fs;     %w1,w2 must be between 0 and 1 for buttord function
w2=2*ws/fs;
[N,wn]=buttord(w1,w2,a1,a2); 
figure(3)
wn=[w1,w2];
[b,a]=butter(N,wn,'bandpass');
w=0:0.01:pi;
[H,omega]=freqz(b,a,w);
mag=20*log(abs(H));
subplot(2,1,1);
plot(omega/pi,mag);
xlabel("Normalized frequency");
ylabel("Magnitude");
title("Magnitude plot");
ang=angle(H);
subplot(2,1,2);
plot(omega/pi,ang);
xlabel("Normalized frequency");
ylabel("Phase");
title("Phase response");
clc;

%% band stop

clear;clc;
% a1=input("Enter the passband ripple: ");
% a2=input("Enter the stopband ripple: ");
% wp=input("Enter the passband frequency: ");
% ws=input("Enter the stopband frequency: ");
a1=1;a2=10;wp=1000;ws=5000;
fs=2*(wp+ws);   % the value of fs muist be greater then only the w1,w2 is normalized bw 0 and 1
w1=2*wp/fs;     %w1,w2 must be between 0 and 1 for buttord function
w2=2*ws/fs;
[N,wn]=buttord(w1,w2,a1,a2); 
figure(4)
wn=[w1,w2];
[b,a]=butter(N,wn,'stop');
w=0:0.01:pi;
[H,omega]=freqz(b,a,w);
mag=20*log(abs(H));
subplot(2,1,1);
plot(omega/pi,mag);
xlabel("Normalized frequency");
ylabel("Magnitude");
title("Magnitude plot");
ang=angle(H);
subplot(2,1,2);
plot(omega/pi,ang);
xlabel("Normalized frequency");
ylabel("Phase");
title("Phase response");
clc;