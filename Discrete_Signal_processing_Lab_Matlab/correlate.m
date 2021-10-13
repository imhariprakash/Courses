clc;clear;
A=input("Enter A: ");
B=input("Enter B: ");
subplot(2,2,1);
stem(0:length(A)-1,A);
xlabel("n-values");
ylabel("Amplitude");
title("X-plot");
subplot(2,2,2);
stem(0:length(B)-1,B);
xlabel("n-values");
ylabel("Amplitude");
title("Y-plot");
subplot(2,2,[3,4]);
C=xcorr(A,B)
stem(0:length(C)-1,C);
xlabel("n-values");
ylabel("Amplitude");
title("Cross Correlation");






