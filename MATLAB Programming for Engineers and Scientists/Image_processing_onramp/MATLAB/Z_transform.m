b = [1]; a=[1, -1, 0.9];
b = [1]; a = [1, -1, 0.9]; n = [-20:120];
h = impz(b,a,n);
subplot(2,1,1); stem(n,h);
title('Impulse Response'); xlabel('n'); ylabel('h(n)')
x = [zeros(1,20),ones(1,121)]; s = filter(b,a,x);
subplot(2,1,2); stem(n,s)
title('Step Response'); xlabel('n'); ylabel('s(n)')
sum(abs(h))
% magz = abs(z);
zeros = roots(a); poles=roots(b); zplane(zeros,poles); 
