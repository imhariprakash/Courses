#include <stdio.h>
int main()
{
int a=12;
double b=15.43;
int *ipoi=&a;
double *dpoi=&b;
*ipoi=1234;
*dpoi=*dpoi+1;
printf("%d %lf %d %lf",*ipoi,*dpoi,a,b);
return 0;
}
