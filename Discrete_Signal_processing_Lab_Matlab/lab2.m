

function h=my_conv(x,y)
subplot(2,2,1);stem(0:length(x)-1,x);
title("X-plot");xlabel("n values");ylabel("x(n) values");
subplot(2,2,2);stem(0:length(y)-1,y);
title("Y-plot");xlabel("n values");ylabel("y(n) values");
h=conv(x,y);
subplot(2,2,[3,4]);stem(h);
title("Linear convolution");xlabel("n values");ylabel("h(n) values");
end