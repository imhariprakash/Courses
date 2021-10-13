clc;clear;
x=input("Enter the sequence: ");
i=input("Enter the N point: ");
n=1;
subplot(3,2,n);
n=n+1;
stem(0:length(x)-1);
xlabel("n-values");
ylabel("Amplitude");
title("X-plot");
if(length(x)<i)
    x=[x,zeros(1,i-length(x))];
    subplot(3,2,n);
    stem(0:length(x)-1,x);
    n=n+1;
    xlabel("n-values");
    ylabel("Amplitude");
    title("X-plot-after zero padding.");
end
y=fft(x);
y1=real(y);
y2=imag(y);
y3=abs(y);
y4=angle(y);
subplot(3,2,n);
stem(y1);
xlabel("n-values");
ylabel("Amplitude");
title("Real Magnitude plot");
n=n+1;
subplot(3,2,n);
stem(y2);
xlabel("n-values");
ylabel("Amplitude");
title("Imaginary Magnitude plot");
n=n+1;
subplot(3,2,n);
stem(y3);
xlabel("n-values");
ylabel("Amplitude");
title("Absolute Magnitude plot");
n=n+1;
subplot(3,2,n);
stem(y4);
xlabel("n-values");
ylabel("Phase");
title("Phase plot");


