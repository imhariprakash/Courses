clc;clear;
x=input("Enter the sequence: ");
i=input("Enter the N point: ");
n=1;
subplot(3,2,n);
n=n+1;
stem(0:length(x)-1);
if(length(x)<i)
    x=[x,zeros(1,i-length(x))];
    subplot(3,2,n);
    stem(0:length(x)-1,x);
    n=n+1;
end
y=fft(x)
y1=real(y);
y2=imag(y);
y3=abs(y);
y4=angle(y);
% subplot(3,2,3);
% stem(0:length(y)-1,y);
subplot(3,2,n);
%stem(0:length(y1)-1,y1);
stem(y1);
n=n+1;
subplot(3,2,n);
%stem(0:length(y2)-1,y2);
stem(y2);
n=n+1;
subplot(3,2,n);
%stem(0:length(y3)-1,y3);
stem(y3);
n=n+1;
subplot(3,2,n);
%stem(0:length(y4)-1,y4);
stem(y4);

