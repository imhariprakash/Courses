function z=circular_conv(x,y)
subplot(2,2,1);stem(x);
title("X-plot");xlabel("n values");ylabel("x(n) values");
subplot(2,2,2);stem(y);
title("Y-plot");xlabel("n values");ylabel("y(n) values");
z=cconv(x,y);
subplot(2,2,[3,4]);stem(z);
title("Circular convolution");xlabel("n values");ylabel("h(n) values");
end