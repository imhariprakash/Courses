#include<stdio.h>
#include<math.h>
void fibo(int n)
{
float fib;
fib=round((pow(((1+sqrt(5))/2),n)/sqrt(5)));
printf("The %d th element of fibonacci series is : %d.",n,(int)fib);
}
int main()
{
int i,n;
printf("Enter n: ");
scanf("%d",&n);
fibo(n);
return 0;
}
