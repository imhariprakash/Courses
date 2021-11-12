%{
Remember our absolutely inefficient recursive Fibonacci implementation that made many unnecessary recursive calls? Here it is:

function f = fibo(n)

if n <= 2

f = 1;

else

f = fibo(n-2) + fibo(n-1);

end

end

We showed an "instrumented" version that computed the number of recursive function calls using a persistent variable. Another way to try to profile the function calls you make is to save a trace. For example, it can be a vector whose elements capture the order the function was called with the various input arguments. In this problem, you need to modify the function above, so that it has an additional input argument, a vector v. The vector needs to store the input arguments of the recursive function calls in the order they were made. Let's call the function fibo_trace, Here is an example run:

>> [f trace] = fibo_trace(6,[])

f =

8

trace =

6 4 2 3 1 2 5 3 1 2 4 2 3 1 2


The output shows that the function was first called with input argument 6, then it was called again with 4 and then with 2. Is this correct? Yes, because we initially called it with 6, then it called itself with n-2, that is 4, and that instance of the function called itself with (n-2), that is 2. At that point there are no further recursive calls, it simply returned the solution 2 to the previous call (with 4) and it called the function again with (n-1), that is, 3. And so on.

Once you have a trace like this, you can identify if the function works as intended or not. You can also use the trace to plot a histogram. See below. Disregard the first bar, but see what the heights of the other bars are and try to figure out what the pattern is. Once you solved the problem, make the histogram yourself with a larger input like 10 or 15. It is fascinating indeed!

>> [f trace] = fibo_trace(10,[]);

>> histogram(trace)

%}

function [f trace] = fibo_trace(n,trace)
    a=[trace n];
    if n <= 2
        f = 1;
    else
        [b c] = fibo_trace(n-2,a);
        [d e] = fibo_trace(n-1,c);
        f=b+d;
        a=e;
    end
    trace=a;
end