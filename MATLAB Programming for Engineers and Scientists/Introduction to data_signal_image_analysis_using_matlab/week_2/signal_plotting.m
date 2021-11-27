T = 100; % seconds
t = 0:T;
f = 1/100;
a = 2*pi*f;
for i = 1 : 50
    phs = i/50;
    y = cos(a*t + 2*pi*phs);
    plot(t, y, 'o');
    xlabel('t (seconds)');
    ylabel(['cos(a*t + 2\pi*', sprintf(' %1.2f)', phs)]);
    drawnow;
end


T = 100; % seconds
t = 0:T;
f = 5/100;
a = 2*pi*f;
y = cos(a*t);
plot(t,y,'bx');
xlabel('t (seconds)');
ylabel('y(t)');

hold on;

t2 = 0:0.5:T;
y2 = cos(a*t2);
plot(t2,y2,'ro');