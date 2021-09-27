clc;clear;
fprintf("1. Auto correlation , 2. Cross Correlation");
n=input("\nEnter: ");
if n==1
    autocorr();
end
if n==2
    crosscorr();
end

function crosscorr()
A=input("Enter A: ");
B=input("Enter B: ");
subplot(2,2,1);
stem(0:length(A)-1,A);
subplot(2,2,2);
stem(0:length(B)-1,B);
subplot(2,2,[3,4]);
C=xcorr(A,B)
stem(0:length(C)-1,C);
end

function autocorr()
A=input("Enter A: ");
subplot(2,1,1);
stem(0:length(A)-1,A);
subplot(2,1,2);
C=xcorr(A)
stem(0:length(C)-1,C);
end


