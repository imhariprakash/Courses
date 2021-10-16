//upto nth element -> displays the series

#include<stdio.h>
#include<math.h>
void fibo(int n)
{
float fib;
fib=round((pow(((1+sqrt(5))/2),n)/sqrt(5)));
//printf("The %d th element of fibonacci series is : %d.",(int)n,(int)fib);
printf("%d ",(int)fib);
}
int main()
{
int i,n;
printf("Enter n: ");
scanf("%d",&n);
for(i=0;i<=n;i++)
fibo(i);
return 0;
}
